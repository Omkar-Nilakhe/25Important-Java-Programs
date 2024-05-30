package Interview;

import java.util.Scanner;

// Program to find factorial using recursion function

public class FactorialUseRec {

	public static int fact = 1;

	public static int recursionFact(int count) {

		if (count > 0) {
			fact = fact * count;
			recursionFact(count - 1);
		}
		return fact;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int num = sc.nextInt();

		int res = recursionFact(num);
		System.out.println("factorial of entered number is :" + res);
      
		sc.close();
	}
	

}
