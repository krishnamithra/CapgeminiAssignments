package java8streams;

import java.util.ArrayList;
import java.util.List;

public class SortedOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Rohit");
		list.add("Oppoppi");
		list.add("YEEHAWWWW?");
		list.add("Hello");
		list.add("Hi");
		list.add("Right");
		list.add("Hilarious");
		list.add("Dull");
		
		list.stream().sorted().map(String::toLowerCase).forEach(System.out::println);

	}
}
