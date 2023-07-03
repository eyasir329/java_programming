package Demo5;

public class SimpleFibonacci {
    static int n;
    public static void main(String[] args) {
        n = 5;
        int fibo1 = 0,fibo2=1;
        System.out.print(fibo1+" "+fibo2);
        while(n>1){
            int fibo = fibo1+fibo2;
            System.out.print(" "+fibo);
            fibo1 = fibo2;
            fibo2 = fibo;
            n--;
        }
    }
}
