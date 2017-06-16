package ch01.sec02;

public class Numbers {

	static int bigNum = Integer.MAX_VALUE;
	long someLongNum = 1234567890L; 
	static int sixTeen = 0x1234F; 
	static int binary = 0b11001; //it's 25
	int million = 1_000_000; //compiler doesn't read _
	static byte b = 5;
	static int unSign = Byte.toUnsignedInt(b); //0-255 I don't know how do it more than 127
	static boolean testIt = Double.isNaN(0.0/0.0); //true; if we divide 0 by 0 we get exception
	static boolean testIt2 = Double.isNaN(1/0.0); //false; if we divide 1 by 0 we get exception
	static boolean testIt3 = Double.isInfinite(1/0.0); //true; if we divide 1 by 0 we get exception
	static char capitalLet = '\u004A'; //it's "J"
	static char smile = '\u263A'; //white smiling face; Eclipse can't print it
	
	public static void main(String[] args) {
		b+=160;
		System.out.println(unSign);
		System.out.println(binary);
		System.out.println(bigNum);
		System.out.println(capitalLet);
		System.out.println(smile);
	}
}
