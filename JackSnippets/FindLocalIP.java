import java.net.*;

public class FindLocalIP
{
	public static void main(String[] args)
	{
		try
		{
			InetAddress address = InetAddress.getLocalHost();
			System.out.println(address);
		}
		catch(Exception ex)
		{
			System.out.println("Could not find this computer's address: " + ex);
		}
	}
}