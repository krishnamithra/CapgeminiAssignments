package java8streams;

import java.util.ArrayList;
import java.util.List;

public class MatchOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Krishna");
		list.add("Hello");
		list.add("Hi");
		
		boolean result = list.stream().allMatch(res->res.startsWith("H"));
		System.out.println(result);
		
		boolean result1 = list.stream().anyMatch(res->res.startsWith("H"));
		System.out.println(result1);
		
		boolean rsult2 = list.stream().noneMatch(res->res.endsWith("r"));
		System.out.println(rsult2);
}
}	
