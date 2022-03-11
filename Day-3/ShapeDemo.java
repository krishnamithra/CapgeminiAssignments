package day3;

class Shape{
	void draw() {
		System.out.println("Drawing shape");
	}
	void erase() {
		System.out.println("Erasing shape");
	}
}

class Circle1 extends Shape{
	void draw() {
		System.out.println("Drawing circle");
	}
	void erase() {
		System.out.println("Erasing circle");
	}
}

class Triangle extends Shape{
	void draw() {
		System.out.println("Drawing triangle");
	}
	void erase() {
		System.out.println("Erasing triangle");
	}
}

class Square extends Shape{
	void draw() {
		System.out.println("Drawing square");
	}
	void erase() {
		System.out.println("Erasing square");
	}
}





public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c=new Circle1();
		Shape t=new Triangle();
		Shape s=new Square();
		
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();

	}

}
