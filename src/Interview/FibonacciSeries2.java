package Interview;

import java.util.Scanner;

// Program to print fibonacci series with recursion function

public class FibonacciSeries2 {

	static int a = 0;
	static int b = 1;
	static int c;

	public static void fibanacciMethod(int count) {

		if (count > 0) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
			fibanacciMethod(count - 1);

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number till the series you want to print ");
		int count = sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		fibanacciMethod(count - 2); // count-2 bcoz two values already defined a and b

		sc.close();
	}

}
