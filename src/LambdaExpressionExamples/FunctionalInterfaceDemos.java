package LambdaExpressionExamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDemos {

	public static void main(String[] args) {
		
		//predicate using lambda expression predicate is known as function interface
		//we are assuming is function interface bcz lambda expression implements only functional interface
		Predicate<Integer> isEven=c -> c%2==0;
		System.out.println(isEven.test(4));
		
		Predicate<String> isWordStartWithR=c -> c.toLowerCase().startsWith("r");
		Predicate<String> isWordEndWithL= c-> c.toLowerCase().endsWith("l");
		Predicate<String> and = isWordStartWithR.and(isWordEndWithL);
		System.out.println(and.test("rahul"));
		
		Consumer<Integer> print = c-> System.out.println(c);
		print.accept(55);
		
		
		//Combined example of functional interfaces
		
		Predicate<Integer> predicate = c-> c %2==0;
		Function<Integer, Integer> function =c -> c*c;
		Consumer<Integer> consumer= c->System.out.println(c);
		Supplier<Integer> supplier= () -> 100;
		
		if(predicate.test(supplier.get())) {
			consumer.accept(function.apply(supplier.get()));
		}
		
		
		BiPredicate<Integer, Integer> biPredicate= (c1,c2)-> (c1+c2)%2==0;
		System.out.println(biPredicate.test(5, 5));
		
		BiFunction<String, String, Integer> biFunction = (c1,c2) -> (c1+c2).length();
		System.out.println(biFunction.apply("rahul", "patil"));
		
		BiConsumer<Integer, String> biConsumer= (c1,c2) -> {
			
			System.out.println(c1);
			System.out.println(c2);
		};
		
		List<String> strList=Arrays.asList("Rahul","Patil","Roshan","Thakare");
		
		strList.forEach(c -> System.out.println(c));
		//Method Reference
		strList.forEach(System.out::println);
		
		
		
	}

}
