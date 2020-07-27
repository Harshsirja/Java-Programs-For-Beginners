class Primenumber
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int count,c,i=3;
		if (n<1) 
		{
			System.out.print("Not Valid term");
			System.exit(0);
		}
		else if(n==1)
		{
			System.out.print("2 ");
		}
		else if(n>1)
		{
			System.out.print("2 ");
			for(count = 2; count <= n; i++)  
		    {
			        for(c = 2; c < i; c++)
			        {
			            if(i%c == 0)
			                break;
			        }
			        if(c == i)
			        {
			            System.out.print(i + " ");
			            count++;    
			        }
		    }
	 	}		
	}
}