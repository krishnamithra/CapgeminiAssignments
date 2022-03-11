package day5;
import java.util.Scanner;
public class ShortLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String word = s.nextLine();
		String word1 = s.nextLine();
		int n = word.length();
		int m = word1.length();
		String combine;
		if(m>n) {
			combine = word1.concat(word);
			System.out.println(word.concat(combine));
			
		}
		else {
			combine = word.concat(word1);
			System.out.println(word1.concat(combine));
		}
		

	}

}
