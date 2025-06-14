package entities;

public class ImportedProduct extends Product{
	
	private double customsFee;
	
	public ImportedProduct() {
		super();		
	}

	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFree(double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return price + customsFee;
	}
	
	@Override
	public String priceTag() {
		return name
				+ " $ "
				+ totalPrice()
				+ "(Customs fee: $ " + customsFee + ")";
		
	}

}
