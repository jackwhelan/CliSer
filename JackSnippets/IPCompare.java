import java.net.*; 
public class IPCompare {
	 public static void main (String args[]) {
		 try {
			 InetAddress one = InetAddress.getByName(args[0]);
			 InetAddress two = InetAddress.getByName(args[1]);
			 System.out.println(one);
			 System.out.println(two);
			 if (one.equals(two)) 
				 System.out.println(one + " is the same IP as " + two);
			 else 
				 System.out.println(one + " is not same IP as " + two);
			}
		 catch (UnknownHostException ex) {
			 System.out.println(ex);
	}	}	}