package day3;
import java.util.Scanner;

class Fruit{
	String name;
	String taste;
	String size;
	
	void eat() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter fruit name:");
		name = s.nextLine();
		System.out.println("Enter fruit taste:");
		taste = s.nextLine();
		System.out.println("Enter fruit size:");
		size = s.nextLine();
		
		System.out.println("The Fruit name is: " + name);
		System.out.println("It tastes like: " + taste);
		
		s.close();
		
	}
}


class Apple extends Fruit{
	void eat() {
		System.out.println("This is Apple!!");
		System.out.println("I am sweet");
	}
}

class Orange extends Fruit{
	void eat() {
		System.out.println("This is Orange!!");
		System.out.println("I am sour");
	}
}







public class FruitsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f = new Fruit();
		f.eat();

	}

}
