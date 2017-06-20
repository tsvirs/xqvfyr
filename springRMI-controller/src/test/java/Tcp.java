import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @author Ab
 * @time 2017/6/17.
 */
public class Tcp implements Runnable{

    private SocketChannel socketChannel;

    public Tcp (SocketChannel socketChannel) {
        this.socketChannel = socketChannel;
    }

    @Override public void run () {

        ByteBuffer byteBuffer = ByteBuffer.allocate (256);
        try {
            socketChannel.read (byteBuffer);
            byteBuffer.flip ();
            while(byteBuffer.hasRemaining ()){
                System.out.print ((char)byteBuffer.get ());
            }
            System.out.println ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }

}
