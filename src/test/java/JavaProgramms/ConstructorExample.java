package JavaProgramms;

public class ConstructorExample {

	ConstructorExample() {
		System.out.println("Constructor is created");
		int i;
		String name;
	}
	
	void product(int i, String name) {
		/*
		 * System.out.println("This is Ramya"); int num = i; String str = name;
		 */
		for (int j = 0; j < 5; j++) {
			System.out.println("My id is: " + j + ", and My name is: " + name);
		}
	}
	
	// main method
	public static void main(String args[]) {
		ConstructorExample b = new ConstructorExample();
		b.product(10, "Ramya");
	}
}