package SingletonPattern;

import java.io.Serializable;

public class BillPughSingleton implements Serializable{

//	Notice the private inner static class that contains the instance of the singleton class. 
//	When the singleton class is loaded, SingletonHelper class is not loaded into memory.
//	Only when someone calls the getInstance method, this class gets loaded and creates the Singleton class instance.
	
	private static final long serialVersionUID = -7604766932017737115L;

	private BillPughSingleton(){}
    
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
    
    
//    By overriding the readResolve method to return the same instance, 
//    we can ensure that the singleton doesn't break in searlization/deserialization process
    protected Object readResolve() {
        return getInstance();
    }
}
