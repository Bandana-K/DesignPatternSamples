package ChainOfResponsibilityPattern;

import java.util.Arrays;
import java.util.List;

public class CategoryValidator extends Validator{
	
	String[] deniedCategories = {"D", "E"};
	private List<String> deniedCategoriesList = Arrays.asList(deniedCategories);

	@Override
	public void validate(Message message) {
		
		System.out.println("Inside CategoryValidator");
		
		if(deniedCategoriesList.contains(message.getCategory()))
			System.out.println("The Message category is filtered");
		else 
			System.out.println("The Message category is good to go ahead");
		
	}

}
