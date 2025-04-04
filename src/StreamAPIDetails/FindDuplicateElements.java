package StreamAPIDetails;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list=Arrays.asList(5,13,21,13,27,59,59,34);
		
		Set<Integer> duplicateIntegers=new HashSet<>();
		// find only duplicates
	    list.stream().filter(c -> !duplicateIntegers.add(c)).collect(Collectors.toSet()).forEach(System.out::println);
	    
	    //find unique
		Set<Integer> duplicate=list.stream().collect(Collectors.toSet());
		
	    System.out.println("Duplicate :" +duplicate);
		
	}

}
