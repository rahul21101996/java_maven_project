package LambdaExpressionExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperations {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(2,1,3,4,5);
		
		System.out.println(list.stream().skip(1).collect(Collectors.toList()));
		
		

		
	}

}
