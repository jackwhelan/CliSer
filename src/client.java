import java.net.*;
import java.io.*;
import java.util.*;

public class Client
{
	public static void main(String[] args)
	{
		Socket client = null;
		try
		{
			client = new Socket("176.61.21.93", 5000);
			System.out.println("Connected to server.");
		}
		catch(Exception ex)
		{
			System.err.println(ex);
		}
		
		try
		{
			Thread r = new ReadingThread(client);
			Thread w = new WritingThread(client, args[0]);
			w.start();
			r.start();
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
			}
		}
		catch(Exception ex)
		{
			System.err.println(ex);
		}
	}
}

class WritingThread extends Thread
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