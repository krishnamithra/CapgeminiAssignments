package javademo;
import java.util.Scanner;


public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char letter = s.next().charAt(0);
		
		if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ) {
			System.out.println("The entered character is a vowel");
		}
		else {
			System.out.println("The entered character is a consonant");
		}

	}

}
