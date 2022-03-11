package java8streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		for(int i=0;i<10;i++) {
			list.add("That Morning we went on a ride");
		}
		
		List<String> set = list.stream().limit(2).collect(Collectors.toList());
		System.out.println("List"+set);

	}

}
