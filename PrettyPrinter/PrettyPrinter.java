class Printer
{
	synchronized public void print(String msg)
	{
		System.out.print("[");
		try
		{
			Thread.sleep(500);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.print(msg);
		System.out.print("]");
	}
}
class User extends Thread
{
	Printer p;
	String printJob;
	User(String printJob,Printer p)
	{
		this.printJob=printJob;
		this.p=p;
		Thread t = new Thread(this);
		t.start();
	}
	public void run()
	{
		p.print(printJob);
	}
}
class PrettyPrinter
{
	public static void main(String[] args) {
		try
		{
			Printer p = new Printer();
			User u1 = new User("Hello",p);
			
			User u2 = new User("How",p);
			
			User u3 = new User("Are You?",p);
			
			User u4 = new User("Are You?1",p);
			
			User u5 = new User("Are You?2",p);
			
			/*u5.start();
			u1.start();
			u2.start();
			u3.start();
			u4.start();*/
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}