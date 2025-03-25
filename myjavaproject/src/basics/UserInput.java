package basics;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userinput = new Scanner(System.in);

		System.out.println("What is your name?");
		String name = userinput.nextLine();

		System.out.println("Your name is:" + name);
		userinput.close();

	}

}
