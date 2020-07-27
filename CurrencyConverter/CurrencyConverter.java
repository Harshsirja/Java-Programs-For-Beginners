class CurrencyConverter
{
	public static void main(String args[])
	{
		int currency=Integer.parseInt(args[0]);
		int rate=70;
		int currencytype=Integer.parseInt(args[1]);

		if (currencytype==1)
		{
			System.out.println("$"+(currency)+"="+(currency*rate)+"INR");
		}
		else
		{
			System.out.println(currency+"INR"+"="+"$"+(currency/rate));	
		}
	}
}