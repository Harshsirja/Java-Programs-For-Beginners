class AllCapital
{
	public static void main(String args[]) {
		String s=args[0];
		int i,j,f=0;
		String spart[]=s.split(" ");
		for ( i=0 ;i<spart.length ;i++ ) 
		{
			f=0;
			for ( j=0; j<spart[i].length() ; j++ ) 
			{
				if ( spart[i].charAt(j)>='A' && spart[i].charAt(j)<='Z') 
				{
					f++;	
				}
			}
			if (f == spart[i].length() ) 
			{
				System.out.print(spart[i] + " ");	
			}
		}
	}
}