package ChainOfResponsibilityPattern;

public class ValidatorHelper {
	
	private Validator categoryValidator = new CategoryValidator();
	
	private Validator merchantValidator = new MerchantValidator();
	
	public Validator getChainOfValidators() {
		
		categoryValidator.setNextValidator(merchantValidator);
		
		return categoryValidator;
	}


}
