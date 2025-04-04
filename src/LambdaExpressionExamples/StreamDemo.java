package LambdaExpressionExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//What is stream?
		//Stream is introduced in Java 8 its a feature
		//which process the collections(like list,map,etc) of data in functional or declarative manner 
		//Simplify data processing
		//Embrace functional programming
		//increase readability and Maintainability
		//Enable easy parallelism
		
		//How to use streams?
		
		//Source(i.e., already we have like list) then doing intermediate operation and then doing terminal operation.
		
		List<Integer> numbersIntegers=Arrays.asList(1,2,3,4,5);
		
		int count=0;
		for(int i: numbersIntegers) {
			if(i %2==0) {
				count ++;
				
			}
		
		}
		System.out.println(count);
		
		System.out.println(numbersIntegers.stream().filter(c -> c %2==0).count());
		
		//Creating stream
		//1. From Collections
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		Stream<Integer> stream1= list.stream();
		
		//2. From Arrays
		String [] arraysStrings= {"a","b","c"};
		Stream<String> stream2= Arrays.stream(arraysStrings);
		
		//Using Stream.of()
		Stream<String> stream3=Stream.of("a","b","c");
		
		//4.Infinite Stream
		Stream<Integer> stream4=Stream.generate(() -> 1);
		Stream<Integer> stream5=Stream.generate(() -> 2).limit(50);
		
		//stream4.forEach(System.out::println);
		//stream5.forEach(System.out::println);
		List<Integer> stream6=Stream.iterate(1, c -> c + 1).limit(10).collect(Collectors.toList());
		stream6.forEach(System.out::println);

		
		
		
		

	}

}