package MindTree;

public class SingletonMainMethod {
	
	public static void main(String[] args) {
		
		SingletonClass singletonClass1=SingletonClass.getInstance();
		SingletonClass singletonClass2=SingletonClass.getInstance();
		
		System.out.println(singletonClass1);
		System.err.println(singletonClass2);
	}

}
