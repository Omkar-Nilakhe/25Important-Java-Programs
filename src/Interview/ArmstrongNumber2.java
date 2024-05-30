package Interview;

import java.util.Scanner;

// Another way to check number is armstrong or not 

public class ArmstrongNumber2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int temp = num;
		int numleng = 0;

		while (num > 0) {
			num = num / 10;
			numleng++;
		}
		System.out.println("the length of number is : " + numleng);

		num = temp;
		int rem = 0;
		double arm = 0;

		while (num > 0) {
			rem = num % 10;
			arm = arm + Math.pow(rem, numleng);
			num = num / 10;

		}
		System.out.println("after calculation the number is : " + arm);

		if (temp == arm) {
			System.out.println("the number is armstrong");

		} else {

			System.out.println("the number is not armstrong");
		}

		sc.close();

	}

}
