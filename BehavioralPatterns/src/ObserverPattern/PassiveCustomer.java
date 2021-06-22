package ObserverPattern;

public class PassiveCustomer implements Observer {
	
	String name ; 
	
	PassiveCustomer(String name){
		this.name = name;
	}
	
	@Override
	public void update(String message) {
		System.out.println("Passive customer made note of the sale.");
		// Passive customer does not react to the message too much
	}
	
}