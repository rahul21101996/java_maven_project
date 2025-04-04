package StreamAPIDetails;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberOfOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Welcome to Rahul Patil's world and Rahul Patil's Welcome You";
		
		List<String> listStrings = Arrays.asList(str.split(" "));
		
		
		System.out.println(listStrings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		
		
	}

}
