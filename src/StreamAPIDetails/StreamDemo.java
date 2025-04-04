package StreamAPIDetails;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(12,20,35,46,55,68,75);
		
		int result=0;
		
		for(int i: list) {
			if(i%5==0) {
				result+=i;
			}
		}
	//	System.out.println(result);
		
		System.out.println(list.stream().filter(i -> i%5==0).reduce(0,(c,e) -> c+e));
		
		//strlist.forEach(System.out::println);
		
		
		//System.out.println(list.stream());

	}

}
