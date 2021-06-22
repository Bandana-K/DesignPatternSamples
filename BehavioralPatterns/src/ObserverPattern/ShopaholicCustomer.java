package ObserverPattern;

public class ShopaholicCustomer implements Observer {
	
	String name ; 
	
	ShopaholicCustomer(String name){
		this.name = name;
	}
	
    @Override
    public void update(String message) {
        processMessage(message);
    }
    
    private void processMessage(String message) {
        System.out.println("Shopaholic customer is interested in buying the product on sale!");
        // A complex psychologic response to a sale by a shopaholic
    }
}