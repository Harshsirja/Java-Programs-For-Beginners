class HTMLText
{
	public static void main(String args[])
	{
		String s = args[0];
		for (int i=0; i<s.length() ; i++ ) 
		{
			if (s.charAt(i)=='<') 
			{
				while(s.charAt(i)!='>')
				{
					i++;
				}
			}	
			else
			{
				System.out.print(s.charAt(i));
			}
		}
	}
}