package java8streams;

import java.util.ArrayList;
import java.util.List;

public class MapOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Krishna");
		list.add("Hello World");
		list.add("Hi");
		list.stream().filter(res->res.endsWith("?")).map(String::toLowerCase).forEach(System.out::println);

	}

}
