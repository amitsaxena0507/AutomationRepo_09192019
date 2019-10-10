package exceptionHandling;

public class ExceptionHandling1 {

	public static void main(String[] args) {
String[] str=new String[3];
		
		str[0]="Animesh";
		str[1]="Sharma";
		str[2]="Techbodhi";
		
		try {
		
		//ArrayIndexOutOfBoundException
		System.out.println(str[3]);
		}catch(ArrayIndexOutOfBoundsException e)
		
		{
			System.out.println(e.getMessage());
		}
		
		try {
		//ArithmeticException
		System.out.println(10/0);
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		String add="Animesh";
		
		try {
	
		//StringIndexOutOfBoundsException
		System.out.println(add.charAt(7));
		}catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Testing completed");


	}

}
