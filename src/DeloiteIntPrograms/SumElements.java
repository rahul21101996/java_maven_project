package DeloiteIntPrograms;

import java.util.Arrays;

public class SumElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Find sum elements in an array using java 8
		//[2,3,4,5,7]
		
		int [] arrays= {2,3,4,5,7};
		
		int sum=Arrays.stream(arrays).sum();
		
		System.out.println(sum);
		
	}

}
