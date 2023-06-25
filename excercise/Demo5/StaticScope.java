package Demo5;


public class StaticScope {
    public static void main(String[] args) {
        int x;
        x=100;
        if(x==100){
            int y= 20;
            System.out.println("x and y :"+x+" "+y);
            x= y+2;
        }
        int y = 100;
        System.out.println("x is : "+x);
    }
}
