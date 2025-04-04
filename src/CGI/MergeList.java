package CGI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=Arrays.asList(1,2,3,4,5);
		List<Integer> list2= Arrays.asList(3,4,5,6,7,8);
		
		List<Integer> mergeList= Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
		
		System.out.println(mergeList);
		
		
		// MEthod 1
		System.out.println("Unique :" + mergeList.stream().distinct().collect(Collectors.toList()));
		
		//method 2
		Set<Integer> uniqueListIntegers=  mergeList.stream().distinct().collect(Collectors.toSet());
		
		System.out.println(uniqueListIntegers);
		
		
	}

}
