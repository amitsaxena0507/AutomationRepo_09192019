package stringClass;

public class StringClass2 {

	public static void main(String[] args) {
		String str="Amit Saxena";
		String[] temp = str.split(" ");
		for(String s:temp)
		{
			System.out.println(s);
			System.out.println("Hello"+temp[1]+""+temp[0]+"!");
		}
	}

}
