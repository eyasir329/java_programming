package Demo5;

public class RecursiveGCD {
    int m,n;
    int gcd(int m,int n){
        if(m>n) return gcd(n,m);
        if(m==n) return m;
        if(m==0) return n;
        if(m==1) return 1;
        return gcd(m,n%m);
    }
    public static void main(String[] args) {
        RecursiveGCD g = new RecursiveGCD();
        g.m = 55;
        g.n = 5;
        System.out.printf("GCD of %d and %d is %d",g.m,g.n,g.gcd(g.m, g.n));
    }
}
