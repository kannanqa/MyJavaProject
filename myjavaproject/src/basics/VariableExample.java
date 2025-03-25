package basics;

public class VariableExample {

	final static int staticVar = 100;

	int instanceVar = 99;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int locVar = 88;

		VariableExample var = new VariableExample();
		System.out.println("Local variable is:" + locVar);
		System.out.println("Instance variable is:" + var.instanceVar);
		System.out.println("Static variable is:" + staticVar);

		locVar = 87;
		System.out.println("Updted value of local variable is:" + locVar);

		var.instanceVar = 98;
		System.out.println("Updted value of instance variable is:" + var.instanceVar);

		// staticVar = 101;
		System.out.println("Updted value of static variable is:" + staticVar);

	}

}
