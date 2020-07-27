interface Interest
{
	void interest(int amount,int rate,int year);
}
class Simple implements Interest
{
	public void interest(int amount,int rate,int year)
	{
		double i=amount * rate * year;
		System.out.print(i);
	}
}
class Compound implements Interest
{
	public void interest(int amount,int rate,int year)
	{
		rate = rate / 100;
		double i=amount * Math.pow((1f + (rate/12f)) , (12f * year) );
		System.out.print(i);
	}
}
class InterestImplement
{
	public static void main(String[] args) {
		Compound c = new Compound();
		c.interest(1000,10,2);
	}
}