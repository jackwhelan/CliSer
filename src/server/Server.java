import java.net.*;
import java.io.*;
import java.util.*;

public class Server
{
	public static void main(String[] args)
	{
		ServerSocket server = null;
		
		try
		{
			server = new ServerSocket(5000,10);
			System.out.println("Server is listening on port 5000.");
		}
		catch (Exception ex)
		{
			System.err.println(ex);
		}
		
		while (true)
		{
			try
			{
				System.out.println("Waiting for Client to Connect.");
				Socket client = server.accept();
				Thread r = new ReadingThread(client);
				Thread w = new WritingThread(client);
				w.start();
				r.start();
			}
			catch (Exception ex)
			{
				System.err.println(ex);
			}
		}
	}
}

class WritingThread extends Thread
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

class ReadingThread extends Thread
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
				if (message == "stop")
				{
					server.close();
				}
			}
		}
		catch(Exception ex)
		{
			System.err.println(ex);
		}
	}
}