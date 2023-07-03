package Demo3;
class Calculator{
    double i;
    Calculator(double i){
        this.i = i;
    }
    double x = Math.sqrt(i);
}
//not working class
//math sqrt not working in class Calculator
public class Example {
    public static void main(String[] args){
        Calculator a = new Calculator(20);
        System.out.println("Square root of "+a.i+" is "+Math.sqrt(a.i));
    }
}
