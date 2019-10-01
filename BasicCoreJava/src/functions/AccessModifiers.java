package functions;

public class AccessModifiers {

	public static void main(String[] args)
	{
		AccessModifiers obj = new AccessModifiers();
		obj.publicfunction();
		obj.privatefunction();
		obj.noAcessModfunction();
		obj.protectedfunction();
	}

	public void publicfunction()
	{
		System.out.println("Public function");
	}

	private void privatefunction()
	{
		System.out.println("private function");
	}

	void noAcessModfunction()
	{
		System.out.println("No Access Mod. function");
	}

	protected void protectedfunction()
	{
		System.out.println("protected function");
	}
}
