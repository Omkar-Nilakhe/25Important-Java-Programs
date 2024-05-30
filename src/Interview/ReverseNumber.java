package Interview;

import java.util.Scanner;

// Program to reverse number and check the number is palindrome or not

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int temp = num;
		int rev = 0, rem;

		while (num > 0) {
			rem = num % 10;         // this logic added last digit of number in to variable rem
			rev = rev * 10 + rem;
			num = num / 10;         // this logic remove last digit of number in to variable num

		}
		System.out.println("the reversed number is : " + rev);

		if (temp == rev) {
			System.out.println("The number is palindrome");

		} else {
			System.out.println("The number is not palindrome");

		}
		sc.close();

	}

}
