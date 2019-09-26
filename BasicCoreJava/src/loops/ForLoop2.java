package loops;

public class ForLoop2 {

	public static void main(String[] args) 
	{
		for(int callToWife=1;callToWife<=10;callToWife++)
		{
			if(callToWife==3)
			{
				System.out.println("will have to say sorry");
				break;
			}
			System.out.println("call again");
		}

	}

}
