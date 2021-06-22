package BuilderPattern;

public class DriverClass {

//	The Builder pattern is a good choice when degsigning classes whose constructors or static factories 
//	would have more than a handful of parameters, espectially ,
//	if many of the parameters are optional or of identical type
	
    public static void main(String args[]) {
        
        //Creating object using Builder pattern in java
        Cake whiteCake = new Cake.Builder()
        		.flour(2)
        		.milk(2)
        		.sugar(0.1)
        		.butter(2)
        		.eggs(2)
        		.cherry(4)
        		.bakingpowder(1)
        		.vanila(1)
        		.build();

        System.out.println(" Cake is ready to eat : " +  whiteCake);
    }
}
