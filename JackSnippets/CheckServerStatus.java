import java.net.*;

public class CheckServerStatus
{
	public static void main(String args[])
	{
		try
		{
			InetAddress address = InetAddress.getByName(args[0]);
			boolean reachable = address.isReachable(2000);
			if(reachable)
			{
				System.out.println("Server is online.");
			}
			else
			{
				System.out.println("Server is down.");
			}
		}
		catch (Exception ex)
		{
			System.out.println("Can't find the IP " + ex);
		}
	}
}