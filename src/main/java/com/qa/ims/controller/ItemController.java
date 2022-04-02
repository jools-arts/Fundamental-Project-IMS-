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
		LOGGER.info("Please enter the id of the customer you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter an item name");
		String name = utils.getString();
		LOGGER.info("Please enter a description");
		String description = utils.getString();
		Item item = itemDAO.create(new Item(id, name, description, description, description, id));
		LOGGER.info("Item created");
		return item;
		
	}

	@Override
	public Item update() {
		LOGGER.info("Please enter the name of the item you would like to update");
		String name = utils.getString();
		LOGGER.info("(Please enter the description of the item you would like to update");
		String description = utils.getString();
		Item item = itemDAO.update(new Item(null, name, description, description, null, null));
		return item;
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the customer you would like to delete");
		long id = utils.getLong();
		return itemDAO.delete(id);
	}
}
