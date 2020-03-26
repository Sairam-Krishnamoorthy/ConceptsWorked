package socketprogramming;
import java.net.Socket;//For Enabling the Socket
import java.io.*;//For Enabling The Streams

public class EchoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try//try Catch Method is used to avoid errors
		{
System.out.println("Client Started..");
Socket soc = new Socket ("localhost",9806);//Ip address is the localhost and Port no. is given
BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));//Reading the data from keyboard and sending to the server
System.out.println("Enter a string");
String str = userInput.readLine();
PrintWriter out = new PrintWriter(soc.getOutputStream(),true);//Boolean Value(true) is added to auto Flush and to send The data
out.println(str);
BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream())); //To get values from server
System.out.println(in.readLine());
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}

}
}
