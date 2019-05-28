import java.util.Arrays;
import java.util.List;

public class Help
{
	public static void main(String[] args)
	{
		List<String> arguments = Arrays.asList(args);
		
		if (arguments.contains("IP"))
		{
			System.out.println(line() + "\nIP\n" + line());
			System.out.println("Takes a domain name as an argument and returns it's IP.");
			System.out.println("E.g.\n java IP www.google.ie");
		}
		if (arguments.contains("IPCharacteristics"))
		{
			System.out.println(line() + "\nIPCharacteristics\n" + line());
			System.out.println("Takes an IP as an argument and returns characteristics about it: Local? Loopback? Unicast/Multicast?");
			System.out.println("E.g.\n java IPCharacteristics 192.168.0.1");
		}
		if (arguments.contains("IPCompare"))
		{
			System.out.println(line() + "\nIPCompare\n" + line());
			System.out.println("Takes an IP as an argument and returns characteristics about it: Local? Loopback? Unicast/Multicast?");
			System.out.println("E.g.\n java IPCharacteristics 192.168.0.1");
		}
		if (arguments.contains("IPTest"))
		{
			System.out.println(line() + "\nIPTest\n" + line());
			System.out.println("");
			System.out.println("E.g.\n java ");
		}
		if (arguments.contains("MyIP"))
		{
			System.out.println(line() + "\nMyIP\n" + line());
			System.out.println("");
			System.out.println("E.g.\n java ");
		}
		if (arguments.contains("ReverseIP"))
		{
			System.out.println(line() + "\nReverseIP\n" + line());
			System.out.println("");
			System.out.println("E.g.\n java ");
		}
		if (arguments.contains("SpamCheck"))
		{
			System.out.println(line() + "\nSpamCheck\n" + line());
			System.out.println("");
			System.out.println("E.g.\n java ");
		}
		if (arguments.contains("TestProtocol"))
		{
			System.out.println(line() + "\nTestProtocol\n" + line());
			System.out.println("");
			System.out.println("E.g.\n java ");
		}
		if (arguments.contains("WebPage"))
		{
			System.out.println(line() + "\nWebPage\n" + line());
			System.out.println("");
			System.out.println("E.g.\n java ");
		}
		if (arguments.contains("WebsiteTest"))
		{
			System.out.println(line() + "\nWebsiteTest\n" + line());
			System.out.println("");
			System.out.println("E.g.\n java ");
		}
	}
	
	public static String line()
	{
		return "=====================================";
	}
	
}