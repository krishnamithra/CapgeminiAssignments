package day5;
import java.util.Scanner;
public class LastThreeChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String word = s.nextLine();
		int n = s.nextInt();
		for(int i=0;i<n;i++) {
			System.out.printf(word.substring(word.length()-n, word.length()));
		}

	}

}
