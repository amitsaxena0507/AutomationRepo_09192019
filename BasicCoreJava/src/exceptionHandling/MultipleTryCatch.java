package exceptionHandling;

import functions.AccessModifiers;

public class MultipleTryCatch {
	static AccessModifiers acc;
	public static void main(String[] args) {

		try {

			String[] str=new String[3];

			str[0]="Animesh";
			str[1]="Sharma";
			str[2]="Techbodhi";

			//ArrayIndexOutOfBoundException
			System.out.println(str[2]);

			//ArithmeticException
			System.out.println(10/1);

			//NullPointerException
			//acc.publicFunction();

			String add="Animesh";
			//StringIndexOutOfBoundsException
			System.out.println(add.charAt(7));
		} catch(ArrayIndexOutOfBoundsException e)

		{
			System.out.println(e.getMessage());

		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally block");
			System.out.println("Closing of data base connection");
			System.out.println("End report");
			System.out.println("Clear chache");
		}

	}

}
