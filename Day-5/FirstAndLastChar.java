package day5;
import java.util.Scanner;
public class FirstAndLastChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String word = s.nextLine();
		int n = word.length();
		if(n>=4) {
			System.out.println(word.substring(1, n-1));
		}
		else {
			System.out.println("String length too short");
		}

	}

}
