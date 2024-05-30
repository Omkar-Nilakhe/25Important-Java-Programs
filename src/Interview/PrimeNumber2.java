package Interview;

import java.util.Scanner;

// Program to check prime number between the given range  

public class PrimeNumber2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a starting number :");
		int num1 = sc.nextInt();

		System.out.println("Enter a ending number :");
		int num2 = sc.nextInt();
		int temp = 0;

		for (int i = num1; i <= num2; i++) {
			temp = 0;
			for (int j = 1; j <= num2; j++) {
				if (i % j == 0) {
					temp++;
				}

			}
			if (temp == 2) {
				System.out.println(i);
			}
			sc.close();
		}

	}

}
