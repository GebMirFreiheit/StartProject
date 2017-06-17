package ch01.sec04;

public class MathOperations {

	public static void main(String[] args) {
		double result;
		result = Math.pow(2,8); //Math.pow uses double variables
		System.out.println(result);
		result = 'J' + 1; //if one isn't double/float/long (in order), both of operands convert to int
		System.out.println(result);//75, because J is 74s
		int noPoint;
		noPoint = (int)Math.pow(2, 8);//If you need integer
		System.out.println(noPoint); //256 without point
		

	}

}
