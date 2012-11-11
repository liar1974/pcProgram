//singleton demo
//Eager
public class SingletonDemo {
	private static final SingletonDemo instance = new SingletonDemo();
	private SingletonDemo(){}
	public static SingletonDemo getInstance(){
		return instance;
	}
}


//Lazy
public class SingletonDemo{
	private static SingletonDemo instance = null;
	private SingletonDemo(){}
	
	public static SingletonDemo getInstance(){
		if(instance == null)
			instance = new SingletonDemo();
		return instance;
	}
}
//thread safe not efficient
publice class SingletonDemo{
	private static SingletonDemo instance = null;
	private SingletonDemo(){}
	
	public synchronized static SingletonDemo getInstance(){
		if(instance == null)
			instance = new SingletonDemo();
		return instance;
	}
}
//efficient using synchronized block

public class SingletonDemo{
	private static SingletonDemo instance = null;
	private SingletonDemo(){}
	
	public static SingletonDemo getInstance(){
		if(instance == null){
			synchronized(this){
				instance = new SingletonDemo();
			}
		}
		
		return instance;
	}
}

//final double check locking

public class SingletonDemo{
	private static SingletonDemo instance = null;
	private SingletonDemo(){}
	
	public static SingletonDemo getInstance(){
		if(instance == null){
			synchronized(this){
				if(instance == null){
					instance = new SingletonDemo();
				}
			}
		}
		return instance;
	}
}
