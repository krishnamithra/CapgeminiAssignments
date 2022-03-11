package day5;
import java.util.Scanner;

public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		if(s1.substring(s1.length()-1).equalsIgnoreCase(s2.substring(0, 1))) {
			System.out.println(s1.concat(s2.substring(1, s2.length()-1)).toLowerCase());
		}
		else {
			System.out.println(s1.concat(s2).toLowerCase());
		}

	}

}
