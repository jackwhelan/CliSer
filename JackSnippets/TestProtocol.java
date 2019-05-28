import java.net.*;

public class TestProtocol
{
	public static void main(String[] args)
	{
		testProtocol("http://www.dit.ie");
		testProtocol("https://www.dit.ie");
		testProtocol("ftp://www.dit.ie");
		testProtocol("mailto:aneel.rahim@dit.ie");
	}
	
	public static void testProtocol(String url)
	{
		try
		{
			URL exvar = new URL(url);
			System.out.println(exvar.getProtocol() + " is supported.");
		}
		catch (Exception ex)
		{
			System.out.println(url + " is not supported.");
		}
	}
}