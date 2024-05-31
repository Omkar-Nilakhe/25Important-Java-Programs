package Interview;

import java.util.Arrays;

// Program to remove duplicasy from sorted and unsorted array

public class RemoveArrayDuplicacy {

	public static void main(String[] args) {

		// if array is not sorted we need to sort array first

		int[] arr = { 12, 56, 34, 67, 56, 12, 67, 59, 17 };

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
		System.out.println("sorted array is : " + Arrays.toString(arr));

		// if array is sorted we directly apply following logic

		int[] temp1 = new int[arr.length];

		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] != arr[i + 1]) {
				temp1[j] = arr[i];
				j++;
			}

		}
		temp1[j] = arr[arr.length - 1];
		System.out.println("duplicacy removed : " + Arrays.toString(temp1));

	}

}
