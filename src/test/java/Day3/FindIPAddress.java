package Day3;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class FindIPAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Returns the instance of InetAddress containing local host name and address
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println(localhost);
			System.out.println(localhost.getHostName());// print hostname
			System.out.println(localhost.getHostAddress());// print Ip address
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}
