package Demo4;
import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if(a>b){
            System.out.printf("Between %d and %d, maximum is %d",a,b,a);
        }else{
            System.out.printf("Between %d and %d, maximum is %d",a,b,b);
        }
    }
}
