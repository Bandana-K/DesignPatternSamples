package ChainOfResponsibilityPattern;

public class Message {
	
	private String category;
	private Merchant merchant;
	
	Message(String category, Merchant merchant){
		this.category = category;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}
	
	class Merchant{
		
		private String merchantName;
		private String merchantCode;

		Merchant(String name, String code){
			this.merchantCode = code;
			this.merchantName = name;
		}
		
		public String getMerchantName() {
			return merchantName;
		}

		public void setMerchantName(String merchantName) {
			this.merchantName = merchantName;
		}
		
		public String getMerchantCode() {
			return merchantCode;
		}

		public void setMerchantCode(String merchantCode) {
			this.merchantCode = merchantCode;
		}
		
		@Override
		public String toString() {
			return "merchantName : "+this.merchantName + ", merchantCode : "+merchantCode;
		}
		
	}
	
	@Override
	public String toString() {
		return "category : "+this.category + ", Merchant : "+merchant;
	}

}

