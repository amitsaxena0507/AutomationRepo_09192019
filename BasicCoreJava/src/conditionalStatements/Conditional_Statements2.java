package conditionalStatements;

public class Conditional_Statements2 {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		int c = 20;
		
		if (b>a&& b>c)
		{
			System.out.println("B is a greater number");
		}else {
			System.out.println("C and A is equal");
		}
		if (b>a|| b>c)
		{
			System.out.println("B is a greater number");
		}else {
			System.out.println("C and A is equal");
		}
		
	}

}
