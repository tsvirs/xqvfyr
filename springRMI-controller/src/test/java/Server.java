import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @author Ab
 * @time 2017/6/16.
 */
public class Server {

    public static void main(String[] args) {

        try (ServerSocketChannel socketChannel = ServerSocketChannel.open()) {

            socketChannel.bind(new InetSocketAddress(10000));
            ThreadPool threadPool;

            while (true) {

                SocketChannel socketChannel1 = socketChannel.accept();
                threadPool = new ThreadPool();
                threadPool.execute(new Tcp(socketChannel1));
                System.out.println("wait:" + threadPool.waitTaks());
                System.out.println("finished:" + threadPool.getFinished_task());

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
