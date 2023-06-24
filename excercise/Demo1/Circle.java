package Demo1;

public class Circle {
    double x,y;
    double r;
    double circumference(){
        return 2*3.1416*r;
    }
    double area(){
        return (22/7)*r*r;
    }
    //set function , we have to call it explicitly
    void setCircle(double a, double b, double c){
        x = a;
        y = b;
        r = c;
    }
    //constructor , we do not call it explicitly
    //its name is same as Class name
    Circle(double a,double b,double c){
        x=a;y=b;r=c;
    }
    //this keyword in box class
    //constructor overloading
    Circle(double r){
        //x=0;
        //y=0;
        //this.r=r;
        this(0.0,0.0,r);
    }
    Circle(Circle c){
        x=c.x;
        y=c.y;
        r=c.r;
        //this(c.x,c.y,c.r);
    }
    Circle(){
        x=0.0;
        y=0.0;
        r=1.0;
        //this(0.0,0.0,1.0);
    }

}
