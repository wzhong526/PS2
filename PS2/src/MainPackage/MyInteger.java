package MainPackage;

public class MyInteger {
	private int value;
	
	public MyInteger (int value)
	{
		this.value = value;
	}
	
	public int GetValue()
	{
		return this.value;
	}
	
	public boolean IsEven()
	{
		return (this.value % 2 == 0);
	}
	
	public boolean IsOdd()
	{
		return (this.value % 2 != 0);
	}
	
	public boolean IsPrime()
	{
		for (int i = 2; i < this.value; i++) {
			if (this.value % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean IsEven(int value)
	{
		return (value % 2 == 0);
	}
	
	public static boolean IsOdd(int value)
	{
		return (value % 2 != 0);
	}
	
	public static boolean IsPrime(int value)
	{
		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean IsEven(MyInteger MyInt)
	{
		return (MyInt.value % 2 == 0);
	}
	
	public static boolean IsOdd(MyInteger MyInt)
	{
		return (MyInt.value % 2 != 0);
	}
	
	public static boolean IsPrime(MyInteger MyInt)
	{
		for (int i = 2; i < MyInt.value; i++) {
			if (MyInt.value % i == 0)
				return false;
		}
		return true;
	}
	
	public boolean equals(int value)
	{
		return (this.value == value);
	}
	
	public boolean equals(MyInteger MyInt)
	{
		return(this.value == MyInt.value);
	}
	
	public static int parseInt(char[]ns)
	{
		int a = 0;
		for (int i = 0; i < ns.length; i++)
			{
			a = a + ns[i];
			}
		return a;
	}
	
	public static int parseInt(String ns)
	{
		return Integer.parseInt(ns);
	}
	
}
