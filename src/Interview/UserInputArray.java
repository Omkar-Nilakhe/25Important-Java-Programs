package Interview;

import java.util.Scanner;

// Program to give an array as a input from user

public class UserInputArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		System.out.println("enter array elements :");
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Entered array is :");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
       sc.close();
	}

}
