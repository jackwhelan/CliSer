import java.net.*;
import java.io.*;
import java.util.*;

public class ReadingThread extends Thread
{
	private Socket connection;
	
	public ReadingThread(Socket con)
	{
		connection = con;
	}
	
	public void run()
	{
		try
		{
			ObjectInputStream in = new ObjectInputStream (connection.getInputStream());
			String message;
			
			while (true)
			{
				message = (String)in.readObject();
				System.out.println(message);
			}
		}
		catch(Exception ex)
		{
			System.err.println(ex);
		}
	}
}