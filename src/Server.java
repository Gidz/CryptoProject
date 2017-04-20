import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by gideon on 20/04/17.
 */
public class Server {
    public static final int PORT = 10025;
    public static void main(String args[]) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("The Server is up and running!");
        while(true)
        {
            Socket socket = serverSocket.accept();
            new ServerThread(socket).start();
        }
    }
}
