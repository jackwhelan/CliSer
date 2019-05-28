import java.net.*;

public class CheckIPv
{
	public static void main(String[] args)
	{
		try
		{
			InetAddress address = InetAddress.getByName(args[0]);
			byte[] byteAddress = address.getAddress();
			if (byteAddress.length == 4)
			{
				System.out.println("IPv4 Address");
			}
			else if (byteAddress.length == 16)
			{
				System.out.println("IPv6 Address");
			}
		}
		catch (Exception ex)
		{
			System.out.println("Can't find the IP: " + ex);
		}
	}
}