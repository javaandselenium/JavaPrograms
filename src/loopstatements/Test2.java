package loopstatements;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String option = "";

		while (!option.equalsIgnoreCase("JAVA") && !option.equals("SELENIUM")) {
			System.out.println("Please enter the crrt word");
			option = scan.next();
		}
		System.out.println("Hi");
		System.out.println("bye");

	}

}
