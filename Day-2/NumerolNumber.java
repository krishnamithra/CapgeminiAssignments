package javademo;
import java.util.Scanner;

public class NumerolNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even=0 , odd=0, r, finalnum, sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = s.nextInt();
		int temp=num;
		while(temp>0) {
			r=temp%10;
			sum+=r;
			if(r%2==0) {
				even++;
				
			}
			else {
				odd++;
			}
			temp/=10;
		}
		
		finalnum = sum;
		NumerolNumber n = new NumerolNumber();
		while(finalnum>9) {
			finalnum = n.simplify(finalnum);
		}
		
		System.out.println("Sum of digits:\n" + sum);
		System.out.println("Numerology number:\n" + finalnum);
		System.out.println("Number of even numbers:\n" + even);
		System.out.println("Number of odd numbers:\n" + odd);
		
		
		
		
		
		
		

	}
	int simplify(int finalnum) {
		int result=0,r,temp=finalnum;
		while(temp>0) {
			r=temp%10;
			result+=r;
			temp/=10;
		}
		return result;
	}
	
	

}
