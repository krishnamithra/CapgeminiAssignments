package java8streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectAndFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<10;i++) {
			set.add(i);
		}
		
		List<Integer> res = set.stream().filter(n->n%2!=0).collect(Collectors.toList());
		System.out.println("List"+res);
	}

}
