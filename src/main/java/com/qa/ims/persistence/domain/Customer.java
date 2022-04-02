package com.qa.ims.persistence.domain;

public class Customer {

	private Long customer_id;
	private String first_name;
	private String surname;
	private String email_address;
	private Long mobile_number;
	private String home_address;
	private String date_of_birth;

	public Customer(Long CustomerId, String FirstName, String Surname, String EmailAddress, Long MobileNumber, String HomeAddress, String DateOfBirth) {
		this.setFirstName(FirstName);
		this.setSurname(Surname);
		this.setEmailAddress(EmailAddress);
		this.setMobileNumber(MobileNumber);
		this.setHomeAddress(HomeAddress);
		this.setDateOfBirth(DateOfBirth);
	}

	public Long getCustomerId() {
		return customer_id;
	}

	public void setCustomerId(Long customer_id) {
		this.customer_id = customer_id;
	}

	public String getFirstName() {
		return first_name;
	}

	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmailAddress() {
		return email_address;
	}

	public void setEmailAddress(String email_address) {
		this.email_address = email_address;
	}

	public Long getMobileNumber() {
		return mobile_number;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobile_number = mobileNumber;
	}

	public String getHomeAddress() {
		return home_address;
	}

	public void setHomeAddress(String home_address) {
		this.home_address = home_address;
	}

	public String getDateOfBirth() {
		return date_of_birth;
	}

	public void setDateOfBirth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + ((customer_id == null) ? 0 : customer_id.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (getFirstName() == null) {
			if (other.getFirstName() != null)
				return false;
		} else if (!getFirstName().equals(other.getFirstName()))
			return false;
		if (customer_id == null) {
			if (other.customer_id != null)
				return false;
		} else if (!customer_id.equals(other.customer_id))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

}