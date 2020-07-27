class Enrollment
{
	public static void main(String args[])
	{
		int f=0;
		String s=args[0];
		int enrollyear=Integer.parseInt(s.substring(0,2));
		int collegeid=Integer.parseInt(s.substring(2,5));
		int enrollsem=Integer.parseInt(s.substring(5,7));
		int branchcode=Integer.parseInt(s.substring(8,9));
		int range=Integer.parseInt(s.substring(9,12));

		if((enrollyear==17||enrollyear==18) && collegeid==47 && branchcode==7)
		{
			if(enrollyear==17 && enrollsem==1)
			{
				if (range >=1 && range <=65)
				{
					f=1;
				}
				else
				{
					f=0;
				}
			}
			else if(enrollyear==18 && enrollsem==31) 
			{
				if(range >=1 && range<=14)
				{
					f=1;
				}
				else
				{
					f=0;
				}
			}
		}
		if(f==1)
		{
			System.out.print("Valid");
		}
		else
		{
			System.out.print("Invalid");
		}
	}
}