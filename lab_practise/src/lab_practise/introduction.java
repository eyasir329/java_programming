package lab_practise;
import java.util.Scanner;
import java.lang.Math;

public class introduction {

	//create an object of a scanner
	Scanner input = new Scanner(System.in);
	//01
	void print_int(){
		System.out.println("input int from user");
		int num = input.nextInt();
		System.out.println("Number : " + num);
	}
	//02
	void add_two_int(){
		System.out.println("Enter two number");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int sum = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + sum);
	}
	//03
	void add_two_float(){
		System.out.println("Enter two Floating number");
		float num3 = input.nextFloat();
		float num4 = input.nextFloat();
		float addFloat = num3 + num4;
		System.out.println(addFloat);
	}
	//04
	void ascii_value(){
		char ch = input.next().charAt(0);
		int ascii =(int)ch;
		System.out.println(ascii);
	}
	//05
	void quotient_renainder(){
		System.out.println("Enter two number");
		int num5 = input.nextInt();
		int num6 = input.nextInt();
		double quotient = (double)num5 / (double)num6;
		double remainder = (double)num5 % (double)num6;
		System.out.println("Quotient : " + quotient + " Remainder : " + remainder);
	}
	//06
	void swap(){
		System.out.println("Enter two number");
		int num7 = input.nextInt();
		int num8 = input.nextInt();
		int temp = num7;
		num7 = num8;
		num8 = temp;
		System.out.println("num1 : " + num7 + " num2 " + num8);
	}
	//07
	void even_odd(){
		System.out.println("Enter a number");
		int num9 = input.nextInt();
		if(num9%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
	//08
	void vowel_cons(){
		System.out.println("Enter a Character");
		char ch2 = input.next().charAt(0);
		if(ch2=='a'|| ch2=='A'|| ch2=='e' || ch2=='E' || ch2=='i' || ch2=='I' || ch2=='o' || ch2=='O' || ch2=='u' || ch2=='U') {
			System.out.println("Vowel");
		}else {
			System.out.println("Consonant");
		}
	}
	//09
	void largest_num(){
		System.out.println("Enter three numbers");
		int num10 = input.nextInt();
		int num11 = input.nextInt();
		int num12 = input.nextInt();
		if(num10>num11 && num10>num12) {
			System.out.println("Number 1 is Greatest");
		}
		else if(num11>num10 && num11>num12) {
			System.out.println("Number 2 is Greatest");
		}else {
			System.out.println("Number 3 is Greatest");
		}
	}
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
