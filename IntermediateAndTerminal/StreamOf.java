package java8streams;

import java.util.stream.Stream;

public class StreamOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> stream = Stream.of(2,4,6,8,2,5,3);
		stream.forEach(res-> System.out.println(res));

	}

}
