import java.util.*;
import java.io.*;
public class ListMover
{
	public static void main(String[] args) throws Exception 
	{
	
		ArrayList<String> subject = new ArrayList<String>();
		ArrayList<String> selectedSubject = new ArrayList<String>();
		Scanner key = new Scanner(System.in);
		String subAdd;
		while (true) 
		{
			System.out.println("1.Add subject");
			System.out.println("2.Select subject");
			System.out.println("3.Display subject");
			System.out.println("4.Exit");
			System.out.println("Enter choice");
			int choice = Integer.parseInt(key.nextLine());
			switch (choice) 
			{
				case 1:	System.out.println("Enter subject Name");
						synchronized(subject)
						{
							subject.add(key.nextLine());	
						}
						break;
				case 2: System.out.println("Enter subject Id");
						synchronized(selectedSubject)
						{
							int id=Integer.parseInt(key.nextLine());
							String select = subject.get(id);
							selectedSubject.add(select);
							subject.remove(id);
						}
						break;
				case 3: System.out.println(subject);
						System.out.println(selectedSubject);
						break;
				default: System.exit(0);
			            break;
			}
		}

	}
}