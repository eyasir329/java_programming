package lab_practise;
import java.util.Scanner;
import java.lang.Math;

public class introduction {

	//create an object of a scanner
	Scanner input = new Scanner(System.in);
	//10
	void quadratic_eq() {
		System.out.println("Equation is like ax^2+bx+c=0");
		System.out.println("Enter the value  of a");
		int a = input.nextInt();
		System.out.println("Enter the value  of b");
		int b = input.nextInt();
		System.out.println("Enter the value  of c");
		int c = input.nextInt();
		//discriminant
		double D = (b*b)-4*a*c;
		//real and equal
		if(D==0.0) {
			System.out.println("Roots are real and equal");
			double r = -b/2.0*a;
			System.out.println("Roots are : x1=x2 = " +r);
		}else if(D>0.0) {
			//real and distinct
			System.out.println("Roots are real and distint");
			double r1 = (-b+Math.sqrt(D))/(2.0*a);
			double r2 = (-b-Math.sqrt(D))/(2.0*a);
			System.out.println("Roots are : x1= " +r1 +"\n\t" +"x2= " +r2);
		}else {
			//imaginary
			System.out.println("Roots are imaginary");
		}
	}
}
