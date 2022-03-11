package day5;
import java.util.Scanner;

public class SpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String word = s.nextLine();
		int n = word.length();
		String result = "";
		for (int i = 0; i < n; i++) {
			
			if (i == 0 && word.charAt(i) != '*')
			  result += word.charAt(i);
			if (i > 0 && word.charAt(i) != '*' && word.charAt(i-1) != '*')
			  result += word.charAt(i);
			if (i > 0 && word.charAt(i) == '*' && word.charAt(i-1) != '*')
			  result = result.substring(0,result.length()-1);
	     }
		 System.out.println(result);
			  


	}

}
