package MindTree;

public class SingletonClass {
	
	public static SingletonClass instanceClass;
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass getInstance()
	{
		if(instanceClass==null) {
			// Double check locking mechanism
			synchronized (SingletonClass.class) {
				if(instanceClass==null) {
					instanceClass=new SingletonClass();
				}
			}
			
		}
		return instanceClass;
	}
}
