package Demo1;

public class CircleDemo {
    public static void main(String[] args) {
        // Circle c = new Circle();
        // Circle c1 = new Circle();
        // Circle c2 = new Circle();
        Circle c3 = new Circle(3.0, 6.4, 7.9);
        Circle c4 = new Circle(9.0);
        Circle c5 = new Circle(c3);
        Circle c6 = new Circle();
        // when we create contructor defaults constructor is not work
        // Box b = new Box();
        Box b1 = new Box(6.5, 49.6, 54.0);

        // c.x = 0.0;
        // c.y = 0.0;
        // c.r = 5.0;
        // c1.x = 5.5;

        // c2.setCircle(4, 8, 9);

        // b.width = 4;
        // b.height = 2;
        // b.depth = 8;

        // System.out.println("Circumference : " + c.circumference());
        // System.out.println("c2 Circumference : " + c2.circumference());
        System.out.println("c3 Circumference : " + c3.circumference());
        System.out.println("c4 Circumference : " + c4.circumference());
        System.out.println("c5 Circumference : " + c5.circumference());
        System.out.println("c6 Circumference : " + c6.circumference());
        // System.out.println("Area of a circle : " + c.area());
        // System.out.println(c1.x);

        // System.out.println("Area of a box : " + b.area());
        System.out.println("Area of a box1 : " + b1.area());
        // System.out.println("Volume of a box : " + b.volume());
    }
}
