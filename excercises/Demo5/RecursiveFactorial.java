package Demo5;

public class RecursiveFactorial {
    int n;
    int factorial(int n){
    if(n==0)
        return(1);
    else
        return(n*factorial(n-1));
    }

    public static void main(String[] args) {
        RecursiveFactorial x = new RecursiveFactorial();
        x.n=5;
        System.out.println("Factorial of "+x.n+" : "+x.factorial(x.n));
    }
    
}
