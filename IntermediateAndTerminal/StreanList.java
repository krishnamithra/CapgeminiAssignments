package java8streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreanList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		for(int i=0;i<10;i++) {
			list.add("Yo yo");
		}
		
		Stream<String> stream = list.stream();
		stream.forEach(res->System.out.println(res));

	}

}
