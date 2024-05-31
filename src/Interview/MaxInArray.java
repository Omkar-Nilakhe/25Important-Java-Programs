package Interview;

// Program to find maximum value in array

public class MaxInArray {

	public static void main(String[] args) {

		int[] arr = { 12, 34, 65, 32, 56, 78 };

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];

			}

		}
		System.out.println("The maximum value in array is : " + max);

	}

}
