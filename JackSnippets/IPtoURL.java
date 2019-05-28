import java.net.*;

public class IPtoURL
{
	public static void main(String args[])
	{
		try
		{
			InetAddress address = InetAddress.getByName("147.252.25.70");
			System.out.println(address.getCanonicalHostName());
		}
		catch (Exception ex)
		{
			System.out.println("Can't find the URL: " + ex);
		}
	}
}