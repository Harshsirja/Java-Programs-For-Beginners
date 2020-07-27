class Queue
{
	int n;
	boolean available=false;
	synchronized int get()
	{
		while(available==false)
		{
			try
			{
				wait();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consumer :" + n);
		available=false;
		notify();
		return n;
	}
	synchronized void put(int n)
	{
		this.n=n;
		while(available==true)
		{
			try
			{
				wait();
			}
			catch (Exception e) {
				e.printStackTrace();	
			}
			System.out.print("Producer :" + n);
			available=true;
			notify();
		}
	}
}
class Producer implements Runnable
{
	Queue q;
	public Producer(Queue q)
	{
		this.q=q;
		Thread t = new Thread(this);
		t.start();
	}
	public void run()
	{
		int i=0;
		while(true)
		{
			q.put(i++);
			System.out.print(q.n);
			try
			{
				Thread.sleep(500);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class Consumer implements Runnable
{
	Queue q;
	public Consumer(Queue q)
	{
		this.q=q;
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
		q.get();
		try
		{
			Thread.sleep(500);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class ProducerConsumer{
	public static void main(String[] args) {
		Queue q = new Queue();
		q.n=0;
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
	}
}