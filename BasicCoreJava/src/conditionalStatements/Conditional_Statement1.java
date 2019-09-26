package conditionalStatements;

public class Conditional_Statement1 {

	static int a = 100;
	static int b = 200;

	public static void sum1()
	{
		int sum = a+b;
		System.out.println("Sum of two numbers is "+sum);
	}

	public static void sub1()
	{
		int sub = a-b;
		System.out.println("Sub of two numbers is"+sub);
	}
	public static void mul1()
	{
		int mul = a*b;
		System.out.println("mul of two number is "+mul);
	}

	public static void div1()
	{
		int div = a/b;
		System.out.println("div of two number is "+div);
	}
	
	public static void mode()
	{
		int mod = b%a;
		System.out.println("mod of two number is"+mod);
	}
	
	public static void main(String[] args) {
		sum1();
		sub1();
		mul1();
		div1();
	}

}
