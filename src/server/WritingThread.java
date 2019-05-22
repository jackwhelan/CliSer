import java.net.*;
import java.io.*;
import java.util.*;

public class WritingThread extends Thread
{
	private Socket connection;
	
	public WritingThread(Socket con)
	{
		connection = con;
	}
	
	public void run()
	{
		try
		{
			ObjectOutputStream out = new ObjectOutputStream(connection.getOutputStream());
			String message;
			Scanner sc = new Scanner(System.in);
			
			while(true)
			{
				message = sc.nextLine();
				out.writeObject("Server: " + message);
			}
		}
		catch(Exception ex)
		{
			System.err.println(ex);
		}
	}
}