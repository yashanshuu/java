package core;

import java.time.LocalDate;

//Item Code ( String) : primary key
//Description : String
//Price : double       
//Shipment Date : LocalDate
//Available stock : int
public class Product {
	private String itemCode;
	private String description;
	private double price;
	private LocalDate shipmentDate;
	private int availableStock;
	
	public Product(String itemCode, String description, double price, LocalDate shipmentDate, int availableStock) {
		super();
		this.itemCode = itemCode;
		this.description = description;
		this.price = price;
		this.shipmentDate = shipmentDate;
		this.availableStock = availableStock;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(LocalDate shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	public int getAvailableStock() {
		return availableStock;
	}

	public void setAvailableStock(int availableStock) {
		this.availableStock = availableStock;
	}

	@Override
	public String toString() {
		return "Product [itemCode=" + itemCode + ", description=" + description + ", price=" + price + ", shipmentDate="
				+ shipmentDate + ", availableStock=" + availableStock + "]";
	}
	
	
}
