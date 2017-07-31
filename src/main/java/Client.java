import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by sinen on 2017-07-30.
 */
public class Client {
    public static void main(String args[]){

        try {
            Socket socket =new Socket();
            socket.bind(new InetSocketAddress("127.0.0.1" , 3000));
            System.out.println("connected!!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
