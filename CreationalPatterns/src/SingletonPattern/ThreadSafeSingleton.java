package SingletonPattern;

public class ThreadSafeSingleton {

//	Instance is created when the first time getInstance is called.
//	To make sure that only one instance is created even in multithreaded env, we have double null check logic
	
	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton(){}

	public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
	    if(instance == null){
	        synchronized (ThreadSafeSingleton.class) {
	            if(instance == null){
	                instance = new ThreadSafeSingleton();
	            }
	        }
	    }
	    return instance;
	}
	
}


