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