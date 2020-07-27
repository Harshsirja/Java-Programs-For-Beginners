class ReverseString
{
	public static void main(String args[]) 
	{
		String s=args[0];
		String part[]=s.split(" ");
		for (int i=part.length-1;i>0;i--  ) 
		{
			System.out.print(part[i] + " ");	
		}
		System.out.print(part[0]);
	}
}