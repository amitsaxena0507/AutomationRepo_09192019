package stringClass;

public class StringClass1 {

	public static void main(String[] args) {
		String str = " anAnd ";
		String str2 = "anand";
		//function 1 size
		System.out.println(str.length());

		//function 2
		System.out.println(str.charAt(3));

		//function 3 upper case
		System.out.println(str.toUpperCase());

		//4 lower case
		System.out.println(str.toLowerCase());

		//5 remove white spaces from both side
		System.out.println(str.trim());

		//6 for comparison
		System.out.println(str.equals(str2));

		//7 ignore case
		System.out.println(str.trim().equalsIgnoreCase(str2));
		
		//8 replace
		System.out.println(str.replace("n", "a"));
		
		//9 split on the basis of char which returns array
		String[] temp = str.split("n");
		for(String s:temp)
		{
			System.out.println(s);
		}
		
		//10 substring
		System.out.println(str.trim().substring(2));
		
		//11 
		System.out.println(str.trim().substring(2, 4));
	}

}
