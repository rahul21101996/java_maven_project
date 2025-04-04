package StreamAPIDetails;

public class MultiplyNumbers {

	public static void main(String[] args) {

		// que. write a program to multiply two numbers using functional interface
		FInterface totalFInterface = (a,b) -> a*b;
		
		System.out.println(totalFInterface.multiply(20, 20));

	}

}
