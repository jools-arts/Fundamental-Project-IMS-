package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.CustomerDAO;
import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.utils.Utils;

/**
 * Takes in customer details for CRUD functionality
 *
 */
public class CustomerController implements CrudController<Customer> {

	public static final Logger LOGGER = LogManager.getLogger();

	private CustomerDAO customerDAO;
	private Utils utils;

	public CustomerController(CustomerDAO customerDAO, Utils utils) {
		super();
		this.customerDAO = customerDAO;
		this.utils = utils;
	}

	/**
	 * Reads all customers to the logger
	 */
	@Override
	public List<Customer> readAll() {
		List<Customer> customers = customerDAO.readAll();
		for (Customer customer : customers) {
			LOGGER.info(customer);
		}
		return customers;
	}

	/**
	 * Creates a customer by taking in user input
	 */
	@Override
	public Customer create() {
		LOGGER.info("Please enter a first name");
		String firstName = utils.getString();
		LOGGER.info("Please enter a surname");
		String surname = utils.getString();
		LOGGER.info("Please enter an email address");
		String emailAddress = utils.getString();
		LOGGER.info("Please enter a moblile number");
		String mobileNumber = utils.getString();
		LOGGER.info("Please enter a home address");
		String homeAddress = utils.getString();
		LOGGER.info("Please enter a date of birth");
		String dateOfBirth = utils.getString();
		Customer customer = customerDAO.create(new Customer(null, firstName, surname, emailAddress, mobileNumber, homeAddress, dateOfBirth));
		LOGGER.info("Customer created");
		return customer;
	}

	/**
	 * Updates an existing customer by taking in user input
	 */
	@Override
	public Customer update() {
		LOGGER.info("Please enter the id of the customer you would like to update");
		Long customerId = utils.getLong();
		LOGGER.info("Please enter the first name of the customer you would like to update");
		String firstName = utils.getString();
		LOGGER.info("Please enter the surname of the customer you would like to update");
		String surname = utils.getString();
		LOGGER.info("Please enter the email address of the customer you would like to update");
		String emailAddress = utils.getString();
		LOGGER.info("Please enter the mobile number of the customer you would like to update");
		String mobileNumber = utils.getString();
		LOGGER.info("Please enter the home address of the customer you would like to update");
		String homeAddress = utils.getString();
		LOGGER.info("Please enter the date of birth of the customer you would like to update");
		String dateOfBirth = utils.getString();
		Customer customer = customerDAO.update(new Customer(customerId, firstName, surname, emailAddress, mobileNumber, homeAddress, dateOfBirth));
		LOGGER.info("Customer Updated");
		return customer;
	}

	/**
	 * Deletes an existing customer by the id of the customer
	 * 
	 * @return
	 */
	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the customer you would like to delete");
		Long customerId = utils.getLong();
		return customerDAO.delete(customerId);
	}

}
