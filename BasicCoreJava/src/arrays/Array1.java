package arrays;

public class Array1 {

	public static void main(String[] args) {
		String[] str=new String[10];
		str[0]="Animesh";
		str[1]="Tejashree";
		str[2]="Mahesh";
		str[3]="Pradeep";
		str[4]="Nikhil";
		str[5]="Bhushan";
		str[6]="Shubhangee";
		str[7]= "Babasaheb";
		str[8]="Shubhada";
		str[9]="Amit";
		//System.out.println(str[5]);
		//System.out.println(str.length);
		//for(int i =0;i<=str.length-1;i++)
		//System.out.println(str[i]);
		for(String s:str) //enhance for loop or for each loop.
		{
			System.out.println(s);
		}
	}

}
