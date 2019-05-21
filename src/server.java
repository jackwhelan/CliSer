import java.net.*;
import java.io.*;

public class server
{
	public static void main(String[] args)
	{
		try
		{
			ServerSocket server = new ServerSocket( 5000, 10 );
			System.out.println("Server is running on port 5000");
			Socket connection = server.accept();
			ObjectOutputStream out = new ObjectOutputStream( connection.getOutputStream() );
			ObjectInputStream in = new ObjectInputStream( connection.getInputStream() );
			String message = "Connection Successful";
			out.writeObject(message);
			message = ( String ) in.readObject();
			System.out.println ("Data from Client: " + message);
			connection.close();
		}
		catch (Exception ex)
		{
			System.err.println(ex);
		}
	}
}