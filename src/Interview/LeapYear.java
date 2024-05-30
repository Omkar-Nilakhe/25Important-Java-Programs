package Interview;

import java.util.Scanner;

// Program to find year is leap year or not. 

public class LeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year to check leap or not :");
		int year = sc.nextInt();

		if ((year % 4 == 0) && (year % 400 == 0 || year % 100 != 0)) {
			System.out.println("entered year is leap");
		} else {
			System.out.println("entered year is not leap");
		}
		sc.close();
	}

}
