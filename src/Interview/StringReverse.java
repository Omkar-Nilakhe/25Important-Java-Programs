package Interview;

import java.util.Scanner;

// Program to reverse a string and also check string is palindrome or not 

public class StringReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		System.out.println("the reverse string is : " + rev);

		if (str.equals(rev)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");

		}
		sc.close();

	}

}
