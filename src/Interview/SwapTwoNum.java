package Interview;

// swapping with using third variable

public class SwapTwoNum {
    
    public static void main(String[] args) {
     
        int a=20;
        int b=30;
        System.out.println("before swapping");
        System.out.println("value of a : "+a);
        System.out.println("value of a : "+b);

        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping");
        System.out.println("value of a : "+a);
        System.out.println("value of a : "+b);

    }

}
