package day4;
import java.util.Scanner;

public class CompareChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char letter1 = s.next().charAt(0);
		char letter2 = s.next().charAt(0);
		
		if((int)(letter1)>(int)(letter2)) {
			System.out.println(letter2 + "," + letter1);
		}
		else {
			System.out.println(letter1 + "," + letter2);
		}
		

	}

}
