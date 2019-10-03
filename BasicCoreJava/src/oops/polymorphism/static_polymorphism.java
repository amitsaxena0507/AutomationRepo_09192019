package oops.polymorphism;

public class static_polymorphism {

	public static void main(String[] args) {
		int add=sum1(10,20);
		System.out.println(add);
		int add2 = sum1(10,20,30);
		System.out.println(add2);
	}
	//Access modifier  Nature of method  Return type of method  Name of method Arguments
	//Type 1
	public static void sum(int a,int b)
	{//signature of method
		int add=a+b;
		System.out.println(add);
	}

	//Type 2

	public static int sum1(int a, int b)
	{
		return a+b;
	}
	//Type 3:->method overloading
	public static int sum1(int a, int b,int c)
	{
		return a+b+c;
	}


}


