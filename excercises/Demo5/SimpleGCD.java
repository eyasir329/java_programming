package Demo5;

public class SimpleGCD {
    public static void main(String[] args) {
        int n1,n2,gcd=0,i;
        n1 = 5;
        n2 = 55;
        for(i=1;i<=n1 && i<=n2;i++){
            if(n1%i==0&&n2%i==0){
                gcd = i;
            }
        }
        System.out.println("GCD"+" of "+n1+" "+n2+" is "+gcd);
    }
}
