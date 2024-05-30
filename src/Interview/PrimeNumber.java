package Interview;

import java.util.Scanner;

// Program to check number is prime or not 

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int temp = 0;

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				temp++;
			}
		}
		if (temp == 2) {
			System.out.println("the entered number is prime");
		} else {
			System.out.println("the entered number is not prime");
		}

		// Another way to check prime number

		// for(int i=2;i<=num-1;i++) {
		//
		// if(num%i==0) {
		// temp++;
		// }
		// }
		// if(temp>0) {
		// System.out.println("the entered number is not prime");
		// }else {
		// System.out.println("the entered number is prime");
		// }

		sc.close();
	}

}
