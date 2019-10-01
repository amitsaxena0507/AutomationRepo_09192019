package loops;

import functions.AccessModifiers;

public class TestAccessModAtProjectLevel extends AccessModifiers{

	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		obj.publicfunction();
		TestAccessModAtProjectLevel obj2 = new TestAccessModAtProjectLevel();
		obj2.protectedfunction();
	}

}
