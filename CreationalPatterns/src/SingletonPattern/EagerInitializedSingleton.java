package SingletonPattern;

public class EagerInitializedSingleton {
	
//	Instance is created as soon as the class is loaded
//	The issue with this approach is if there happens any issue with object creation
//	we have no control over exception handling
    
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}