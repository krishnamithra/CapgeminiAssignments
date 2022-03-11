package java8streams;

import java.util.stream.Stream;

public class StreamOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> stream = Stream.of(new String[] {"Krishna","Mithra","Btech","Hyderabad","Cool"});
		stream.forEach(res->System.out.println(res));

	}

}
