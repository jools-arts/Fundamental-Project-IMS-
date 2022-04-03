package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Order {
	
	private Long orderNumber;
	
	public Order(Long OrderNumber) {
		this.setOrderNumber(OrderNumber);
	}

	public Long getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}

	@Override
	public String toString() {
		return "Order [order_number=" + orderNumber + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(orderNumber, other.orderNumber);
	}
	
	
}
