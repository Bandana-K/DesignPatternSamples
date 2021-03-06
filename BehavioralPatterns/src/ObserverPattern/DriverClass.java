package ObserverPattern;

//https://stackabuse.com/the-observer-design-pattern-in-java
public class DriverClass {  
	
	public static void main(String[] args) {
		
	    Store fashionStore = new Store();
	    Observer customer1 = new PassiveCustomer("Prakash");
	    Observer customer2 = new ShopaholicCustomer("Bandana");
	    Observer customer3 = new ShopaholicCustomer("Pooja");

	    fashionStore.addSubscriber(customer1);
	    fashionStore.addSubscriber(customer2);

	    // Notifying customers (observers)
	    fashionStore.notifySubscribers();

	    // A customer has decided not to continue following the newsletter
	    fashionStore.removeSubscriber(customer1);

	    // customer2 told customer3 that a sale is going on
	    fashionStore.addSubscriber(customer3);

	    // Notifying the updated list of customers
	    fashionStore.notifySubscribers();
	}
    
}
