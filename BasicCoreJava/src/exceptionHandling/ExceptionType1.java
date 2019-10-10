package exceptionHandling;

import functions.AccessModifiers;

public class ExceptionType1 {
	static AccessModifiers acc;
	public static void main(String[] args) {
		String[] str=new String[3];

		str[0]="Animesh";
		str[1]="Sharma";
		str[2]="Techbodhi";

		//ArrayIndexOutOfBoundException
		//System.out.println(str[3]);

		//ArithmeticException
		//System.out.println(10/0);

		//NullPointerException
		//acc.publicFunction();

		String add="Animesh";
		//StringIndexOutOfBoundsException
		System.out.println(add.charAt(7));


	}

}
