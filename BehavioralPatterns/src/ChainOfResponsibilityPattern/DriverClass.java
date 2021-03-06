package ChainOfResponsibilityPattern;


public class DriverClass {

	public static void main(String[] args) {

		Message message = new Message("A", null);
		Message.Merchant merchant = message.new Merchant("ABC", "ABC");
		message.setMerchant(merchant);
		
		System.out.println(message);

		new ValidatorHelper().getChainOfValidators().processValidation(message);
		
	}

}