package Interview;

import java.util.Scanner;

// simple calculator using switch statement

public class SimpleSwitchCalci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter first the number :");
		int num1 = sc.nextInt();

		System.out.println("enter second the number :");
		int num2 = sc.nextInt();

		System.out.println("enter Symbol to perform operation :");
		String sym = sc.next();

		float res = 0;

		switch (sym) {

			case "+":
				res = num1 + num2;
				break;

			case "-":
				res = num1 - num2;
				break;

			case "/":
				res = num1 / num2;
				break;

			case "*":
				res = num1 * num2;
				break;

			default:
				System.out.println("entered symbol is invalid");

		}
		sc.close();
		System.out.println(res);

	}

}
