import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by gideon on 20/04/17.
 */
public class ServerThread extends Thread {
    Socket socket;
    ServerThread(Socket socket)
    {
        this.socket = socket;
    }
    public void run()
    {
        try {
            DataInputStream tunnelIn = new DataInputStream(socket.getInputStream());
            while (true)
            {
                String message = tunnelIn.readUTF();
                System.out.println(">"+message);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
