package Interview;

import java.util.Scanner;

// Program to find even or odd Numbers

public class EvenOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to check even or odd :");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + " Number is Even");

		} else {
			System.out.println(num + " Number is Odd");
		}
		sc.close();
	}

}
