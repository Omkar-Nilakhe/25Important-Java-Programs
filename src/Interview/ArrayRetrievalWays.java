package Interview;

import java.util.Arrays;

// program to iterate array using following loops and method.

public class ArrayRetrievalWays {

	public static void main(String[] args) {

		int[] arr = { 12, 34, 67, 54, 89, 43, 54 };

		// this is in-build method we use to retrieve array in a string
		System.out.println(Arrays.toString(arr));
		System.out.println("============================================");

		// using for-Each loop
		for (int x : arr) {
			System.out.println(x);
		}
		System.out.println("============================================");

		// using for-loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("============================================");

		// using while loop
		int i = 0;
		while (i < arr.length) {
			System.out.println(arr[i]);
			i++;
		}
		System.out.println("============================================");

		// using do-while loop
		int j = 0;
		do {
			System.out.println(arr[j]);
			j++;
		} while (j < arr.length);

	}

}
