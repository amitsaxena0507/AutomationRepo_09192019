package functions;

public class User1 {

	public static void main(String[] args) 
	{
		Car polo = new Car();
		polo.wheels=5;
		polo.color="Silver";
		polo.type="Hatchback";
		polo.accleration();
		
		Car car2=new Car();
		car2.wheels=6;
		//car2.color="Black";
	//	car2.type="sedan";
		car2.accleration();
		
		Car car3=new Car();
		
		System.out.println(polo.color);
		System.out.println(car2.color);
		System.out.println(car3.color);
		
		System.out.println(polo.wheels);
		System.out.println(car2.wheels);
		System.out.println(car3.wheels);
	}

}
