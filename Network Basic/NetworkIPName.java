import java.net.*;
import java.util.*;
class NetworkIPName
{
	public static void main(String[] args) throws UnknownHostException {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter HostName");
		String hostname = key.nextLine();
		InetAddress addbyname = InetAddress.getByName(hostname);
		System.out.print(addbyname);
	}
}