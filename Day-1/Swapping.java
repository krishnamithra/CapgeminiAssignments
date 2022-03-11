package javademo;
import java.util.Scanner;


public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After swapping: " + a + " " + b);

	}

}
