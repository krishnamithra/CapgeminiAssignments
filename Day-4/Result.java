package day2;

class Animal {
	void eat() {
		System.out.println("I am hungry");
	}

	void sleep() {
		System.out.println("I need sleep");
	}

}

class Bird extends Result {
	void fly() {
		System.out.println("I am flying!");
	}

}

class Result {
	public static void main(String args[]) {

		Bird b = new Bird();
		b.fly();
		
		Animal a = new Animal();
		a.eat();
		a.sleep();
	}
}
