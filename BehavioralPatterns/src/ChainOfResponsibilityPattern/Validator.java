package ChainOfResponsibilityPattern;

import java.util.Objects;

public abstract class Validator {

	private Validator nextValidator;

	public Validator getNextValidator() {
		return nextValidator;
	}

	public void setNextValidator(Validator nextValidator) {
		this.nextValidator = nextValidator;
	}

	public abstract void validate(Message message);

	public void processValidation(Message message) {

		this.validate(message);
		if (!Objects.isNull(nextValidator)) {
			nextValidator.processValidation(message);
		}

	}
}
