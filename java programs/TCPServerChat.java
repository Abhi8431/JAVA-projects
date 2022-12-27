import java.net.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
public class TCPServerChat{

public static void main(String[] args)
{
try
{

int port = 8002;

String received = "", send = "";

BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
ServerSocket server = new ServerSocket(port);
System.out.println("TCPServerChat Started on port: " + port); 
Socket client = server.accept();
DataInputStream in = new DataInputStream( client.getInputStream());
DataOutputStream out = new DataOutputStream( client.getOutputStream());
System.out.println("\"send exit to stop the Application\"");
while((received = in.readLine()) != null)
{
if (received.equalsIgnoreCase("EXIT"))
{
 break;

} 
System.out.println("Client: " + received);
System.out.print("Server: ");
out.writeBytes(send + "\n"); }

send = br.readLine();

client.close();

server.close();

}

catch(Exception e)

{ e.printStackTrace();

}

}

}