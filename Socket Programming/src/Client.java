import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception{

        Socket socket = new Socket("localhost", 1234); //Creates a new socket

        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));//This will send input to the server
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));/* waiting for a response from the server*/
        String message  = "Hi! Im Ali";

        output.write(message);
        output.newLine();
        output.flush();
        String messageFromServer = input.readLine();
        System.out.println(messageFromServer);


        socket.close();
    }
}