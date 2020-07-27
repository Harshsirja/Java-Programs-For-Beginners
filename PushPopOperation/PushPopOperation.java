class Operation
{
	int SIZE; 
	int TOP;
	int s[];
	Operation()
	{
		TOP=-1;
		SIZE=10;
		s = new  int[SIZE];
	}
	Operation(int SIZE)
	{
		TOP=-1;
		this.SIZE=SIZE;
		s = new  int[SIZE];	
	}
	void push(int v)
	{
		if (TOP>=SIZE) 
		{
			System.out.println("Stack Overflow ");
		}
		else
		{
			TOP++;
			s[TOP]=v;
			System.out.println("Pushed element " + v);
		}
	}
	void pop()
	{
		int x;
		if (TOP==-1) 
		{
			System.out.println("Stack Empty ");
		}
		else 
		{
			x=s[TOP];
			TOP--;	
			System.out.println("Poped element " + x);	
		}		
	}
}
class Stack
{
	public static void main(String[] args) {
		Operation op = new Operation();
		op.push(20);
		op.pop();
		op.push(30);
		op.pop();
		op.push(40);
		op.push(50);
		op.pop();
		op.pop();	
	}
}