import java.net.*;
import java.io.*;
import java.util.*;

public class WritingThread extends Thread
{
	private Socket connection;
	String username;
	
	public WritingThread(Socket con, String uname)
	{
		connection = con;
		username = uname;
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
				out.writeObject(username + ": " + message);
			}
		}
		catch(Exception ex)
		{
			System.err.println(ex);
		}
	}
}