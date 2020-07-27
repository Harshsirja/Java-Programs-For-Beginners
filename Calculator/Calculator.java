class Calculator
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		String s=args[1];
		int b=Integer.parseInt(args[2]);
		if(s.equals("+"))
			System.out.print(a + b);
		else if(s.equals("-"))
			System.out.print(a - b);
		else if(s.equals("*"))
			System.out.print(a * b);
		else if(s.equals("/"))
			System.out.print(a / b);
		else if(s.equals("%"))
			System.out.print(a % b);
		else
			System.out.println("Invalid!");
	}
}