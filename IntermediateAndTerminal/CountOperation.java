package java8streams;

import java.util.ArrayList;
import java.util.List;

public class CountOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Krishna");
		list.add("Hello");
		list.add("Hi");


		
		Long result = list.stream().filter(res->res.endsWith("i")).count();
		System.out.println(result);

	}
}
