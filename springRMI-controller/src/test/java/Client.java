import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @author Ab
 * @time 2017/6/16.
 */
public class Client{

    public static void main (String[] args) {
        for (int i = 0; i < 8; i++) {
//            new Thread(
//                    ()->{
//                try ( SocketChannel socketChannel = SocketChannel.open () )
//
//                 {
//                    socketChannel.connect (new InetSocketAddress ("127.0.0.1",10000));
//                    ByteBuffer writeBuffer = ByteBuffer.allocate (256);
//                    writeBuffer.put ("Just a test!".getBytes ("UTF-8"));
//                    writeBuffer.flip ();
//                    socketChannel.write (writeBuffer);
//                } catch (IOException e) {
//                    e.printStackTrace ();
//                }
//            }
//            ).start ();

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try(SocketChannel socketChannel = SocketChannel.open()){

                        socketChannel.connect(new InetSocketAddress("127.0.0.1",10000));
                        ByteBuffer wb = ByteBuffer.allocate(256);

                        wb.put("just a test!".getBytes("UTF-8"));
                        wb.flip();


                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
            });

            thread.start();

        }
    }
}
