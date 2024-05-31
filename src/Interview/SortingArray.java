package Interview;

//import java.util.Arrays;

// Program to sorted array using for loop

public class SortingArray {

	public static void main(String[] args) {

		int[] arr = { 30, 12, 24, 17, 29, 34, 10 };

		// we can sort array using sort method in arrays class
		// Arrays.sort(arr);
		// System.out.println(Arrays.toString(arr));

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}
		System.out.println("The sorted array is :");
		for (int a : arr) {
			System.out.println(a);
		}

	}

}
