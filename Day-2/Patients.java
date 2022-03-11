package day2;
import java.util.Scanner;

public class Patients extends Patient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patients p = new Patients();
		double total = p.BMI(16.0, 9.0);
		System.out.println("Your BMI is: " + total);
		

	}

}

class Patient{
	public double BMI(double height,double weight) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = s.nextLine();
		System.out.println("Hello " + name + ", Welcome to Zoy hospital.");
		double result = (weight/(height*height))*703;
		return result;
	}
	
}
