package Demo4;

public class Demo4 {
    public static void main(String[] args) {

        int x = 100;
        System.out.printf("Printing simple integer : x = %d\n", x);
        System.out.printf("Formated with precision : PI = %.2f\n", Math.PI);

        float n = 5.2f;
        //automatically appends zero to the rightmost part of decimal
        System.out.printf("Formated to specific width : n = %8.19f\n", n);

        n = 1239278.3f;
        System.out.printf("Formated to right margin : %20.4f\n", n);
    }
}
