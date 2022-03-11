package day5;
import java.util.Scanner;
public class HalfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String word = s.nextLine();
		int n = word.length();
		if(n%2==0) {
			System.out.println(word.substring(0, n/2));
		}
		else {
			System.out.println("NULL");
		}

	}

}
