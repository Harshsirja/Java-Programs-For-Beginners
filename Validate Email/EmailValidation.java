public class EmailValidation
{
	/*
	Enter email addres<br />
	abcdefghi12@gmail.com<br />
	*/
	public static void main(String[] args) 
	{
		String s=args[0];
		int l=s.length();
		char charno;
		int i;
		int firstpart_length=s.indexOf('@');
		if (!((s.charAt(0)>='0' && s.charAt(0)<='9') || (s.charAt(0)>='a' && s.charAt(0)<='z')))
		{
			
			System.out.println("First character must be digit or in lower case");
			System.exit(0);		
		}
		if (!(firstpart_length>=8 && firstpart_length<=20))
		{
			System.out.println("lenght must be between 8 to 20");
			System.exit(0);
		}
		for (i=1;i<firstpart_length;i++) 
		{
			if (!((s.charAt(i)>='0' && s.charAt(i)<='9') ||(s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)=='_')||(s.charAt(i)=='.')))
			{
				System.out.println("Only digit or lower case or @ or _ allow");
				System.exit(0);
			}
		}
		String s2=s.substring((firstpart_length));
		if(( s2.indexOf('.') - s2.indexOf('@') ) - 1 <=2  )
		{
			System.out.println("domain name must be greater than 2 character between @ and . symbol");
			System.exit(0);
		}
		for (i=s2.indexOf('@')+1;i<s2.indexOf('.') ;i++ )
		{
			if (!(s2.charAt(i)>='a' && s2.charAt(i)<='z')) 
			{
				System.out.println("after @ symbol all chharacter in lower case");
				System.exit(0);
			}		
		}
		for (i=s2.indexOf('.')+1;i<s2.length();i++) 
		{
			if (!(s2.charAt(i)>='a' && s2.charAt(i)<='z')) 
			{
				System.out.println("after . symbol all chharacter in lower case");
				System.exit(0);
			}	
		}
		System.out.println("Valid");		
	}
}