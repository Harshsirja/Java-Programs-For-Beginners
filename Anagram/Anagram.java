class Anagram
{
	public static void main(String args[])
	{
		
		String s1=args[0];
		String s2=args[1];
		int a1[] = new int[62];
		int a2[] = new int[62];
		int ascii=0;
		int i,j;
		int l=0;
		if(s1.length()==s2.length())
		{
			for( i=0;i<s1.length();i++)
			{
				ascii=s1.codePointAt(i);
				if ( s1.charAt(i)>='a' && s1.charAt(i)<='z' ) 
				{
					a1[ascii-97]++;			
				}
				else if (s1.charAt(i)>='A' && s1.charAt(i) <='Z') 
				{

					a1[ascii-65+26]++;
				}
				else if (s1.charAt(i)>='0' && s1.charAt(i)<='9') 
				{

					a1[ascii-48+52]++;
				}
			}
			for (j=0 ; j<s2.length() ; j++ ) 
			{
				ascii=s2.codePointAt(j);
				if ( s2.charAt(j)>='a' && s2.charAt(j)<='z' ) 
				{

					a2[ascii-97]++;			
				}
				else if (s2.charAt(j)>='A' && s2.charAt(j)<='Z') 
				{
					
					a2[ascii-65+26]++;
				}
				else if (s2.charAt(j)>='0' && s2.charAt(j)<='9') 
				{
					
					a2[ascii-48+52]++;
				}
			}
			for(i=0;i<62;i++)
			{
				if(a1[i]==a2[i])
				{
					l++;
				}
			}
			if (l==62) 
			{
				System.out.print("Valid");
			}
			else
			{
				System.out.print("Invalid");
			}
		}
		else
		{
			System.out.print("Invalid");
		}
	}
}