package functions;

public class Functions2 {
	
	

	public static void main(String[] args) 
	{
		//fun1();//static functions called only static functions and variables.
		//you have to create obj of that class
		Functions2 obj = new Functions2();
		obj.fun1();
	}
	public void fun1()
	{
		System.out.println("Testing");
	}
}
