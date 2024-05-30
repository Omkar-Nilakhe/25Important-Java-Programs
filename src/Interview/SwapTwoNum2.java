package Interview;

// swapping without using third variable

public class SwapTwoNum2 {

    public static void main(String[] args) {

        int a = 20;
        int b = 30;
        System.out.println("before swapping");
        System.out.println("value of a : " + a);
        System.out.println("value of a : " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swapping");
        System.out.println("value of a : " + a);
        System.out.println("value of a : " + b);

    }

}
