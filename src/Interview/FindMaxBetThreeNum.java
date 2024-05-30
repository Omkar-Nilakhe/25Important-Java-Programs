package Interview;

//Find Maximum number between three numbers 

public class FindMaxBetThreeNum {

	public static void main(String[] args) {
		int a = 40, b = 60, c = 89;

		if (a > b && a > c) {
			System.out.println(a + " a is greater");
		} else if (b > a && b > c) {
			System.out.println(b + " b is greater");
		} else {
			System.out.println(c + " c is greater");
		}

	}

}
