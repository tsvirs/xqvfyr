import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Ab
 * @time 2017/6/16.
 */
public class ThreadPool {
    private static final int maxSize = 8;
    private static final int coreSize = 4;
    private static volatile long completedTask = 0;
    private final BlockingQueue<Runnable> queue = new LinkedBlockingDeque<>();
    private TaskThread[] tasks;
    private final ReentrantLock lock = new ReentrantLock();

    public ThreadPool() {
        this(coreSize);
    }

    public ThreadPool(int sum) {
        if (sum <= coreSize) sum = coreSize;
        else if (sum >= maxSize) sum = maxSize;
        tasks = new TaskThread[sum];
        for (int i = 0; i < sum; i++) {
            tasks[i] = new TaskThread();
            tasks[i].start();
        }
    }

    public void execute(Runnable r) {
        synchronized (queue) {
            queue.add(r);
            queue.notify();
        }

    }

    public void execute(Runnable[] rs) {
        synchronized (queue) {
            for (Runnable r : rs) {
                queue.add(r);
            }
            queue.notify();
        }
    }

    private class TaskThread extends Thread {
        private Runnable r;
        private volatile boolean isRunning = true;

        @Override
        public void run() {
            while (isRunning) {
                lock.lock();
                try {
                    try {
                        while (!queue.isEmpty()) {
                            r = queue.poll();
                        }
                        if (r != null) {
                            ++completedTask;
                            r.run();
                        }
                        r = null;
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                } finally {
                    lock.unlock();
                }
            }
        }

        public void shutdown() {
            isRunning = false;
        }

    }

    public int waitTaks() {
        return queue.size();
    }

    public long getFinished_task() {
        return completedTask;
    }

}
