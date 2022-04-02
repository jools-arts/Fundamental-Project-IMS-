package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Item {
	
	private Long item_id;
	private String name;
	private String description;
	private String colour;
	private String brand;
	private float price;
	
	public Item(Long id, String name, String description, String colour, String brand, Long price) {
		this.setId(id);
		this.setName(name);
		this.setDescription(description);
		this.setColour(colour);
		this.setBrand(brand);
		this.setPrice(price);
	}

	public Long getId() {
		return item_id;
	}

	public void setId(Long id) {
		this.item_id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}
	

	@Override
	public String toString() {
		return "Item [item_id=" + item_id + ", name=" + name + ", description=" + description + ", colour=" + colour
				+ ", brand=" + brand + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, colour, description, item_id, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(colour, other.colour)
				&& Objects.equals(description, other.description) && Objects.equals(item_id, other.item_id)
				&& Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}
	
	

}