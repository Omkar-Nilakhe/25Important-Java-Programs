package Interview;

// Program to Iterate 2D array

public class ArrayRetrieval2D {

	public static void main(String[] args) {

		int[][] arr = { { 10, 20 }, { 30, 40, 50 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);

			}
		}

	}

}
