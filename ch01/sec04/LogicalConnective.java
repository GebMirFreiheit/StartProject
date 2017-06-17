package ch01.sec04;

public class LogicalConnective {

	public static void main(String[] args) {
		byte binary;
		binary = 5>8 ? 1 : 0; //binary is 0 cause condition isn't met
		byte conjuction = 30&0xF; //
		System.out.println(conjuction);
		byte not = (byte)~binary;
		System.out.println(not);
		

	}

}
