package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Item {
	
	private Long itemId;
	private String name;
	private String description;
	private String colour;
	private String brand;
	private float price;
	
	public Item(Long id, String name, String description, String colour, String brand, Long price) {
		this.setId(itemId);
		this.setName(name);
		this.setDescription(description);
		this.setColour(colour);
		this.setBrand(brand);
		this.setPrice(price);
	}

	public Long getId() {
		return itemId;
	}

	public void setId(Long id) {
		this.itemId = id;
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
	
	public void confirmName() {
		if(this.name.isBlank());
		throw new RuntimeException("invalid entry for name, please enter a value for name");
	}
	
	public void confirmDescription() {
		if(this.description.isBlank());
		throw new RuntimeException("invalid entry for description, please enter a value for description");
	}
	
	public void confirmColour() {
		if(this.description.isBlank());
		throw new RuntimeException("invalid entry for colour, please enter a value for colour");
	}
	
	public void confirmBrand() {
		if(this.brand.isBlank());
		throw new RuntimeException("invalid entry for brand, please enter a value for brand");
	}
	
	public void confirmPrice() {
		if(this.price < 0);
		throw new RuntimeException("invalid entry for price, please enter a value for price");
	}
	

	@Override
	public String toString() {
		return "Item [item_id=" + itemId + ", name=" + name + ", description=" + description + ", colour=" + colour
				+ ", brand=" + brand + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, colour, description, itemId, name, price);
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
				&& Objects.equals(description, other.description) && Objects.equals(itemId, other.itemId)
				&& Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}
	
	

}