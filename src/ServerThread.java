import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
            ObjectInputStream tunnelIn = new ObjectInputStream (socket.getInputStream());
            while (true)
            {
                Message message= (Message) tunnelIn.readObject();
                System.out.println(message.getDetails()+"\n----------------------------");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
