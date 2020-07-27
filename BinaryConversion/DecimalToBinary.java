class DecimalToBinary
{
	public static void main(String[] args) {
		int value=Integer.parseInt(args[0]);
		int type=Integer.parseInt(args[1]);
		int q[]=new int[10];
		int i=0;
		int temp;
		int decimal=0;
		if(type==1)
		{
			while(value>0)
			{
				q[i]=value%2;
				i++;
				value/=2;
			}
			while(i>=0)
			{
				System.out.print(q[i]);
				i--;
			}
		}
		else
		{
			while(value>0)
			{
				temp=value%10;
				decimal+=(temp*Math.pow(2,i));
				value/=10;
				i++;
			}
			System.out.print(decimal);
		}
	}
}