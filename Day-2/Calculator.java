package day2;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = Calculator.powerInt(16, 9);
		double result1 = Calculator.powerDouble(16.0, 9);
		
		System.out.println("The Integer Power result is: " + result);
		System.out.println("The Double Power result is: " + result1);

	}
	
	static int powerInt(int num1,int num2) {
		int total = (int)Math.pow(num1, num2);
		return total;
	}
	
	static double powerDouble(double num1,int num2) {
		double total = Math.pow(num1, num2);
		return total;
	}
	
	
	

}
