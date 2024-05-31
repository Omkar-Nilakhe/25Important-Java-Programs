package Interview;

//import java.util.Arrays;

// Program to merge array .

public class MergeArray {

	public static void main(String[] args) {

		int[] a = { 12, 14, 16, 18, 89 };
		int[] b = { 34, 56, 78, 32, 79, 23 };

		// The logic to declare length of array c
		int cleng = a.length + b.length;
		int[] c = new int[cleng];

		// add array a element in array c
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}

		// add array b element in array c
		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];
		}

		// System.out.println(Arrays.toString(c));

		for (int el : c) {
			System.out.println(el);

		}

	}

}
