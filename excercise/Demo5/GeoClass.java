package Demo5;
class Box{
    float x = 10;
    float y = 20;
    float w = 15;

    float area(){
        return (2*(x*y+y*w+w*x));
    }
}
class Circle{
    float x = 0;
    float y = 0;
    float r = 5;
     float area(){
        return ((22/7)*r*r);
    }
}

public class GeoClass {
    float y = 10;
    public static void main(String[] args) {
        float x= 50;
        Box b = new Box();
        Circle c = new Circle();
        System.out.println("GeoClass Data "+ x);
        System.out.println("Box Data "+ b.x);
        System.out.println("Circle Data "+ c.x);
        System.out.println("Box area "+ b.area());
        System.out.println("Circle area "+ c.area());
    }
}
