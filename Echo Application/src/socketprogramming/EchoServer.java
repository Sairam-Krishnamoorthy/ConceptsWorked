package socketprogramming;
import java.net.ServerSocket;//To Enable the ServerSocket
import java.net.Socket;
import java.io.*;

public class EchoServer {

	public static void main(String[] args) {
		
		try
		{
System.out.println("Waiting For Clients...");
ServerSocket ss = new ServerSocket(9806);
Socket soc = ss.accept();
System.out.println("Connection Established..");
BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));//read data from the socket ,read the string passed by client
String str  = in.readLine();
PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
out.println("Server Says:"+ str);

}
		catch(Exception e)
		{
         e.printStackTrace();
		}
		}

}
