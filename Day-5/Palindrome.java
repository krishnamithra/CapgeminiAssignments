package day5;
import java.util.Scanner;


public class Palindrome {
	
	
	
	static boolean isPalindrome() {
		Scanner s = new Scanner(System.in);
		String word = s.nextLine();
		int i=0,j=word.length()-1;
		while(i<j) {
			if(word.charAt(i)!=word.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(isPalindrome()) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}

	}

}
