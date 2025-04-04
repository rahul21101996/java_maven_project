package LambdaExpressionExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Intermediate operation transform a stream into another stream
		//They are lazy, meaning they dont execute until a terminal operation is invoked.
		
		//1. filter
		List<String> list=Arrays.asList("Ansh","Anamika","Rahul","Ash","Patil","Rahul");
		Stream<String> filtereStream=list.stream().filter(c -> c.startsWith("A"));
		//no filtering at this point the above is with terminal operation bcz its lazy so it will not execute until terminal operation
		long a=list.stream().filter(c -> c.startsWith("A")).count();
		System.out.println(a);
		
		//2.map
		
		Stream<String> mapStream=list.stream().map(String::toUpperCase);
		
		//3.sort
		Stream<String> sortedStream=list.stream().sorted();
		//sorted stream using comparator
		Stream<String> sorteStreamUsingComparatorStream=list.stream().sorted( (c , b) -> c.length()-b.length());
		
		//4.distinct
		list.stream().filter(c -> c.startsWith("R")).distinct().count();
		Stream<String> distinctStream=list.stream().distinct();
		distinctStream.forEach(System.out::println);
		
		//5.limit
		
		System.out.println(Stream.iterate(1, c -> c+1).limit(10).count());

		//6. Skip
		System.out.println(Stream.iterate(1, c -> c+1).skip(10).limit(50).count());
		
		
		
		

	}

}
