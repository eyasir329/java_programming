package lab_practise;
import java.util.Scanner;

public class decision_making {
	Scanner input = new Scanner(System.in);
	//01
	void leap_year() {
		int year = input.nextInt();
		if((year%400==0)||(year%4==0)&&(year%100!=0)) {
			System.out.println("Leap Year");
		}else {
			System.out.println("Not Leap Year");
		}
	}
	//02
	void posi_negative() {
		int num = input.nextInt();
		if(num>=0){
			System.out.println("Positive");
		}else {
			System.out.println("Negative");
		}
	}
	//03
	void alpha_not() {
		char ch = input.next().charAt(0);
		if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z')) {
			System.out.println("Character is Alphabet");
		}else {
			System.out.println("Character is not Alphabet");
		}
	}
	//04
	void sum_natural() {
		System.out.println("Enter the last value");
		int num = input.nextInt(); 
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum = sum + i;
		}
		System.out.println("Sum is : " +sum);
	}
	//05
	void fact() {
		System.out.println("Enter a number");
		int num = input.nextInt();
		int f=1;
		for(int i=num;i>0;i--) {
			f = f*i;
		}
		System.out.println("Factorial of "+num+" is : "+f);
	}
	//06
	void multi_table() {
		System.out.println("Enter a number");
		int num = input.nextInt();
		int multi=1;
		for(int i=1;i<=num;i++) {
			multi = num*i;
			System.out.println(num + " * " + i+" = " + multi);
		}
	}
	//07
	void fibonacci() {
		System.out.println("How length");
		int num = input.nextInt();
		int num1=0;
		int num2=1;
		System.out.println("Fibonacci Series :");
		System.out.print(num1+" "+num2+" ");
		for(int i=3;i<=num;i++) {
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.print(num3+" ");
		}
	}
	//08
	void gcd() {
		System.out.println("Enter two numbers");
		int num1 = input.nextInt();
		int num2 = input.nextInt(); 
		int gcd =0;
		for(int i=1;i<=num1&&i<=num2;i++) {
			if(num1%i==0&&num2%i==0) {
				gcd =i;
			}
		}
		System.out.println("GCD : "+gcd);
	}
	//09
	void lcm() {
		System.out.println("Enter two numbers");
		int num1 = input.nextInt();
		int num2 = input.nextInt(); 
		int gcd =0,lcm=0;
		for(int i=1;i<=num1&&i<=num2;i++) {
			if(num1%i==0&&num2%i==0) {
				gcd =i;
			}
		}
		lcm=(num1*num2)/gcd;
		System.out.println("LCM : "+lcm);
	}
	//10
	void alphabet() {
		for(int i='A';i<='Z';i++) {
			System.out.println((char)i+" ");
		}
	}
	//11
	void num_digit() {
		System.out.println("Enter a integer");
		int num = input.nextInt();
		int i,count=0;
		i=num;
		while(i!=0) {
			i=num/10;
			num=num%10;
			count++;
		}
		System.out.print(count);
	}
}





































