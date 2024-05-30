package Interview;

import java.util.Scanner;

// Program to check number is armstrong or not

public class ArmstrongNumber {

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
		System.out.println("The length of entered number is : " + numleng);

		num = temp;
		int rem = 0;
		int arm = 0;

		while (num > 0) {
			int res = 1;
			rem = num % 10;

			for (int i = 1; i <= numleng; i++) {
				res = res * rem;

			}
			
			arm = arm + res;
			num = num / 10;
		}
		System.out.println(arm);
		
		 if(temp==arm) {
	        	System.out.println("the number is armstrong");
	        	
	        }else {
	        	
	        	System.out.println("the number is not armstrong");
	        }

		sc.close();
	}

}
