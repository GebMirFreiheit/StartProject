/**
 * 
 */
package ch01.sec01; //yeah, I could do it! 
import java.util.Random;

/**
 * @author user
 *
 */
//Okay, I don't know what means a comment above...
public class HelloWorld {

	public static void main(String[] args) {
		//System.out.println("Hello, World!".length());
		
		Random generator = new Random();
		for(int i=0;i<3;i++) {
			System.out.println(generator.nextInt());
			System.out.println(" ");
			}

	}

}
