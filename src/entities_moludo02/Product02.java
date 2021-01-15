package entities_moludo02;

public class Product02 {
	private String name;
	private Double price;
	private int quantity;
	
	public Product02() {
	}
	
	public Product02(String name, double price, int quantity) {
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	
	public Product02(String name, double price) {
		this.name=name;
		this.price=price;
	}
	
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
	
	public double totalValueInStock () {
		return price * quantity;
	}
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " unitis, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
