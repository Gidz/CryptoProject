import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by gideon on 20/04/17.
 */
public class Client {
    public static void main(String args[]) throws IOException {
//        String name = args[0];
        Socket socket = new Socket(InetAddress.getLocalHost(), 10025);
        DataOutputStream tunnelOut = new DataOutputStream(socket.getOutputStream());
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                String messageToSend = input.nextLine();

                System.out.println("Packing and sending " + messageToSend);
                tunnelOut.writeUTF(messageToSend);

                //DataInputStream tunnelIn = new DataInputStream(socket.getInputStream());
                //System.out.println(">"+tunnelIn.readUTF());
            } catch (IOException e) {
                System.out.println("Sorry, cannot connect to the server.");
            }
        }
    }
}
