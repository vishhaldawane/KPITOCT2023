public class Bank //central class to wire with other classes k
{
	public static void main(String args[])
	{
		System.out.println("hello bank");

		Savings savObj1 = new Savings();
		Current currObj1  = new Current();
		Fixed fixObj1 = new Fixed();

		savObj1.withdraw();
		currObj1.transfer();
		fixObj1.deposit();
		
		
	}
}
class Savings
{
	public void withdraw() 
	{
		System.out.println("hello savings");
	}
}

class Current
{
	public void transfer()
	{
		System.out.println("hello current");
	}
}

class Fixed
{
	public void deposit()
	{
		System.out.println("hello Fixed");
	}
}


