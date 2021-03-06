package SingletonPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

//https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
public class DriverClass {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    	
    	
    	//test for reflection break
    	
        EagerInitializedSingleton reflectionInstanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton reflectionInstanceTwo = null;
        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                reflectionInstanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("reflection test instance One hashCode = " + reflectionInstanceOne.hashCode());
        System.out.println("reflection test instance Two hashCode = " + reflectionInstanceTwo.hashCode());
    	
    		
    	//Test for serialization and deserialization
    	BillPughSingleton serInstanceOne = BillPughSingleton.getInstance();
    	
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(serInstanceOne);
        out.close();
        
        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        BillPughSingleton serInstanceTwo = (BillPughSingleton) in.readObject();
        in.close();
        
        System.out.println("sereliazation test instance One hashCode = "+serInstanceOne.hashCode());
        System.out.println("sereliazation test instance Two hashCode = "+serInstanceTwo.hashCode());
        
    }
    
}
