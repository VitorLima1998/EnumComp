package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;

	private Products products;

	public OrderItem() {

	}

	public OrderItem(Integer quantity, Double price, Products products) {

		this.quantity = quantity;
		this.price = price;
		this.products = products;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public double subTotal() {
		return price * quantity;
	}

	@Override
	public String toString() {
		return getProducts().getName() + ", $" + String.format("%.2f", price) + " Quantity: " + quantity + " SubTotal: "
				+ " $" + String.format("%.2f", subTotal());
	}

}