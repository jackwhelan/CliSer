import java.net.*;

public class SpamChecker
{
	public static void main(String[] args) throws Exception
	{
		String IP = "2.0.0.127";
		String website = ".sbl.spamhaus.org";
		String query;
		String[] split = args[0].split(".");
		
		for(int i = split.length; i > 0; i--)
		{
			IP += split[i];
		}
		
		System.out.println(IP);
		
		try
		{
			query = IP + website;
			InetAddress.getByName(query);
			System.out.println( IP + " is a known spammer.");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
 

