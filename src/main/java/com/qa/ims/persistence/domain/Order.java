package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Order {
	
	private Long order_number;
	
	public Order(Long OrderNumber) {
		this.setOrderNumber(OrderNumber);
	}

	public Long getOrder_number() {
		return order_number;
	}

	public void setOrder_number(Long order_number) {
		this.order_number = order_number;
	}

	@Override
	public String toString() {
		return "Order [order_number=" + order_number + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(order_number);
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
		return Objects.equals(order_number, other.order_number);
	}
	
	
}
