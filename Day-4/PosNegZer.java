package day4;
import java.util.Scanner;

public class PosNegZer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int temp = s.nextInt();
		if(temp<0) {
			System.out.println("Number is negative");
		}
		else if(temp>0) {
			System.out.println("Number is positive");
		}
		else {
			System.out.println("Number is zero");
		}

	}

}
