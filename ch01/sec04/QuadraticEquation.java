package ch01.sec04;
//Obviously, this program solves the quadratic equations
import java.util.Scanner;
public class QuadraticEquation {

	public static void main(String[] args) {
		System.out.println("Enter the coefficients");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt(); //Here should be check that a != 0
		int b = in.nextInt();
		int c = in.nextInt();
		
		double D = b*b - 4*a*c; //Counting discriminant 
		if(D<0) 
			System.out.println("No solutions");
		if(D==0) {
			int x = Math.round(-b/(2*a)); //I just wanted to use this method somewhere
			System.out.println(x);
		}
		if(D>0) {
			int x1 = (int)Math.round((-b+Math.sqrt(D))/(2*a));
			int x2 = (int)Math.round((-b-Math.sqrt(D))/(2*a));
			System.out.println(x1);
			System.out.println(x2);
		}
		
	}

}
