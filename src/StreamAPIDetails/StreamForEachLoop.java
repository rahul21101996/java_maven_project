package StreamAPIDetails;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		
		// 1 step make more efficient
	/*	Consumer<Integer> c=new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				
				System.out.println(t);
				
			}
			
		};*/
		
		// 2nd step
		//Consumer<Integer> c=i -> System.out.println(i);
		
		//now only once we used this above code then we just copy i -> System.out.println(i); and paste it in forEach() method.
		
		//3rd step 
	//	values.forEach(i -> System.out.println(i));
		
		//above is the internal implementation of below commented code.
		//forEach loop call one by one accept method to get a value.
		//values.forEach(i -> System.out.println(i));

		//forEach loop gives internal implementation like give one and print one value.
		
		//without writiing any any variable we use lamba expression explicitly here
		//values.forEach(System.out::println); //we are using something called as method reference.

		values.forEach(StreamForEachLoop::doubleint); // method reference
	}
	
	public static void doubleint(int i) {
		System.out.println(i*2);
	}

}
