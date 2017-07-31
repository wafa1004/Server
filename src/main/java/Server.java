
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public Server() {
    }

    public static void main(String[] var0) {
        try {
            ServerSocket var1 = new ServerSocket(3000);
            Socket var2 = var1.accept();
            System.out.println("connected");
        } catch (IOException var3) {
            var3.printStackTrace();
        }

    }
}
