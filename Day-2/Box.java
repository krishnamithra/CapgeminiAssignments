package day2;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b = new Box();
		double result = b.boxDimensions(16.0, 9.0, 25.0);
		System.out.println("The volume is: " + result);
		

	}
	
	public double boxDimensions(double width,double height,double depth) {
		double volume = width*height*depth;
		return volume;
	}

}
