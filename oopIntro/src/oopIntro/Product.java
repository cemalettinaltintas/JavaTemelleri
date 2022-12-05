package oopIntro;

public class Product {
	//fields
	//camelCase
	private String name;
	private double unitPrice;
	private double unitsInStock;
	private double discount;
	private String imageUrl;
	private double unitPriceAfterDiscount;
	
	public Product() {
		System.out.println("I worked");
	}
	//constructor overloading

	//Encapsulation - Kapsülleme
	
	public double getUnitPriceAfterDiscount() {
		return this.unitPrice- (this.unitPrice*this.discount/100);
	}
	//Constructor overloading
	public Product(String name, double unitPrice, double unitsInStock, double discount, String imageUrl) {
		this();
		this.name = name;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		this.discount = discount;
		this.imageUrl = imageUrl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(double unitsInStock) {
		if (unitsInStock<0) {
			unitsInStock=0;
		}
		this.unitsInStock = unitsInStock;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		//discount+=5;
		this.discount = discount;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
}
