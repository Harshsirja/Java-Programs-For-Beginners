class LastSecondCapital
{
	public static void main(String args[]) {
		
		String s=args[0];
		int i,j,f=0;
		int k=-1;
		String spart[]=s.split(" ");
		String capital[]=new String[spart.length];
		for ( i=0 ;i<spart.length ;i++ ) 
		{
			f=0;
			for ( j=0; j<spart[i].length() ; j++ ) 
			{
				if ( spart[i].charAt(j)<='Z' && spart[i].charAt(j)>='A') 
				{
					f++;	
				}
			}
			if (f == spart[i].length() ) 
			{
				k++;
				capital[k]=spart[i];
			}
		}
		if (k==0) 
		{
			System.out.print(capital[0]);
		}
		else if(k>=1)
		{
			System.out.print(capital[k-1]);
		}
	}
}