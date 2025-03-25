package basics;

public class AssignmentOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 100;
		int num2 = 50;

		// Assigning value of variable num2 to the variable num1
		num1 = num2;
		System.out.println("Output of num1 = num2 is " + num1);
		// it returns 50

		// num1 = num1+num2
		num1 += num2;
		System.out.println("Output of num1 = num1+num2 is " + num1);
		// it returns 50+50=100

		// num1 = num1-num2
		num1 -= num2;
		System.out.println("Output of num1 = num1-num2 is " + num1);
		// it returns 100-50=50

		// num1 = num1*num2
		num1 *= num2;
		System.out.println("Output of num1 = num1*num2 is " + num1);
		// it returns 50*50=2500

		// num1 = num1/num2
		num1 /= num2;
		System.out.println("Output of num1 = num1/num2 is " + num1);
		// it returns 2500/50=50

		// num1 = num1%num2
		num1 %= num2;
		System.out.println("Output of num1 = num1%num2 is " + num1);
		// it returns 50/50=0

	}

}
