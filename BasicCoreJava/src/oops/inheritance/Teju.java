package oops.inheritance;

public class Teju {

	public static void main(String[] args) {
		Smartphone phone = new Smartphone();
		phone.calling();
		phone.texting();
		phone.internet();
		
		Telephone phone2 = new Telephone();
		phone2.calling();
		//runtime binding and dynamic polymorphism,runtime polymorphism.
		Telephone phone3 = new Smartphone();
		phone3.calling();
	}

}
