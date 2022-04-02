package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.core.Logger;

import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order> {
	
	public static final Logger LOGGER = Log.Manager.getLogger();
	
	private OrderDAO orderDAO;
	private Utils utils;
	
	public OrderController(OrderDAO orderDAO, Utils utils) {
		super();
		this.orderDAO = orderDAO;
		this.utils = utils;
	}
	
	@Override List<Order> readAll() {
		List<Order> orders = orderDAO.readAll();
		for (Order order : orders) {
			LOGGER.info(order);
		}
		return orders;
	}
	
	@Override
	public Order create() {
		LOGGER.info("Please enter an item");
	}

}
