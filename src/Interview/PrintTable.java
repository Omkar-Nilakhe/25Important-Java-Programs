package Interview;

import java.util.Scanner;

// Program to Print a table using for loop

public class PrintTable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(num * i);

		}
		sc.close();
	}

}
