package Interview;

// Program to find minimum value in array

public class MinInArray {

	public static void main(String[] args) {

		int[] arr = { 12, 34, 65, 32, 56, 78 };

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];

			}

		}
		System.out.println("The minimum value in array is : " + min);

	}

}
