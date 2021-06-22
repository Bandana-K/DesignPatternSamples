package SingletonPattern;

public enum EnumSingleton {

//	As enums have no explicit constructors hence, even the reflection cannt break it
	
    INSTANCE;
    
    public static void doSomething(){
        //do something
    }
}