package StreamAPIDetails;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindUniqueValuesUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// find unique numbers from given list
		List<Integer> list = Arrays.asList(1,2,3,1,3,4,5);
		
		System.out.println(list.stream().distinct().collect(Collectors.toList()));
		
		

	}

}
