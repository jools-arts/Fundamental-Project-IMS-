package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;

public class ItemController implements CrudController<Item> {
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	private ItemDAO itemDAO;
	private Utils utils;
	
	public ItemController(ItemDAO itemDAO, Utils utils) {
		super();
		this.itemDAO = itemDAO;
		this.utils = utils;
	}

	@Override
	public List<Item> readAll() {
		List<Item> items = itemDAO.readAll();
		for (Item item : items) {
			LOGGER.info(item);
		}
		return items;
	}

	@Override
	public Item create() {
		LOGGER.info("Please enter a name");
		String name = utils.getString();
		LOGGER.info("Please enter a description");
		String description = utils.getString();
		LOGGER.info("Please enter a colour");
		String colour = utils.getString();
		LOGGER.info("Please enter a brand");
		String brand = utils.getString();
		LOGGER.info("Please enter a price");
		Long price = utils.getLong();
		Item item = itemDAO.create(new Item(null, name, description, colour, brand, price));
		LOGGER.info("Item created");
		return item;
		
	}

	@Override
	public Item update() {
		LOGGER.info("Please enter the name of the item you would like to update");
		String name = utils.getString();
		LOGGER.info("Please enter the description of the item you would like to update");
		String description = utils.getString();
		LOGGER.info("Please enter the colour of the item you would like to update");
		String colour = utils.getString();
		LOGGER.info("please enter the brand of the item you would like to update");
		String brand = utils.getString();
		LOGGER.info("Please enter the price of the item you would like to update");
		Long price = utils.getLong();
		Item item = itemDAO.update(new Item(null, name, description, colour, brand, price));
		return item;
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the customer you would like to delete");
		long id = utils.getLong();
		return itemDAO.delete(id);
	}
}
