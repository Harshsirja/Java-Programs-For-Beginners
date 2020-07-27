import java.util.*;
import java.io.*;
class PhoneBook
{
	public static void main(String[] args) {
		Properties phoneDictionary = new Properties();
		Scanner key = new Scanner(System.in);
		String name,phoneNumber;
		while(true)
		{
			System.out.println("1.Add New Contact");
			System.out.println("2.Search Contact");
			System.out.println("3.Remove Contact");
			System.out.println("4.Replace Contact");
			System.out.println("5.Exit");
			System.out.println("Enter Your Choice");
			int choice = Integer.parseInt(key.nextLine());
			switch(choice)
			{
				case 1: name = key.nextLine();
						phoneNumber = key.nextLine();
						phoneDictionary.put(name,phoneNumber);
						break;
				case 2: name = key.nextLine();
						System.out.println(phoneDictionary.get(name));
						break;
				case 3: name = key.nextLine();
						phoneDictionary.remove(name);
						break;
				case 4:	name = key.nextLine();
						phoneNumber = key.nextLine();
						phoneDictionary.replace(name,phoneNumber);
						break;
				case 5: System.exit(0);
						break;
				default:break;
			}
		}
	}
}