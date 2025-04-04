package Cognizant;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		list.stream().filter(n->n%2==0).forEach(System.out::println);

	}

}
