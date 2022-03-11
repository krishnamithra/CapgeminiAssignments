package day5;
import java.util.Scanner;
public class Repeator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String word = s.nextLine();
		String result;
		result = String.join("X", word,word,word);
		System.out.println(result);

	}

}
