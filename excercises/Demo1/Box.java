package Demo1;
public class Box {
    double width;
    double height;
    double depth;
    double area(){
        double a;
        a=(width*height + height*depth + depth*width)/2;
        return a;
    }
    double volume(){
        double v;
        v=width*height*depth;
        return v;
    }
    Box(double width,double height,double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    //multiple constructor in circle class
}
