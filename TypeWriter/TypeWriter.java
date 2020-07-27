class TypeWriter extends Thread {
	String msg;
	TypeWriter(String msg)
	{
		this.msg=msg;
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
		try
		{
			for (int i=0;i<msg.length() ;i++ ) {
				Thread.sleep(1000);
				System.out.print(msg.charAt(i));
			}			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		TypeWriter tw = new TypeWriter("Harsh Sirja");
	}
}