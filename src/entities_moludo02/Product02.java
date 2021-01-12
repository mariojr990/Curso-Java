package entities_moludo02;

public class Product02 {
	public String name;
	public Double price;
	public int quantity;
	
	public Product02(String name, double price, int quantity) {
		this.name=name;
		this.price=price;
		this.quantity=quantity;
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
