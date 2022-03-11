package FunctionalInterfaceAndLambda;

import java.util.Optional;

interface Finder4{
	public double value(Optional<Double> a,Optional<Double> b);
}

public class Remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Finder f= (a,b) ->{
			
			
			Double a1 = a.orElse((double) 0);
			Double b1 = b.get();
			
			return a1%b1;
			
			
			
		};
		Double value1 = 6.5;
		Double value2 = new Double(8.0);
		Optional<Double> a = Optional.ofNullable(value1);
		Optional<Double> b = Optional.of(value2);
		
		System.out.println(f.value(a, b));
		

	}

}
