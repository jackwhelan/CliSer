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