package java8streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReducedOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Krishna");
		list.add("Hello");
		list.add("Hi");
		
		Optional<String> result = list.stream().limit(3).reduce((s1,s2)->s1 + "reduced" + s2);
		System.out.println(result);

	}
}
