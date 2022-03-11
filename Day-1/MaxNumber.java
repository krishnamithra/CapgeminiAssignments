package javademo;
import java.util.Scanner;


public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int temp = a>b?a:b;
		int largest = temp>c?temp:c;
		
		System.out.println("The largest number is: " + largest);

	}

}
