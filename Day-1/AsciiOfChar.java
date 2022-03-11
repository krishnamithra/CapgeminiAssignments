package javademo;
import java.util.Scanner;



public class AsciiOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char letter = s.next().charAt(0);
		int ascii = letter;
		
		System.out.println("The ASCII value is: " + ascii );

	}

}
