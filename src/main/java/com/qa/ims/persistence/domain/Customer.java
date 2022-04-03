package com.qa.ims.persistence.domain;

public class Customer {

	private Long customerId;
	private String firstName;
	private String surname;
	private String emailAddress;
	private String mobileNumber;
	private String homeAddress;
	private String dateOfBirth;

	public Customer(Long CustomerId, String FirstName, String Surname, String EmailAddress, String MobileNumber, String HomeAddress, String DateOfBirth) {
		this.setCustomerId(CustomerId);
		this.setFirstName(FirstName);
		this.setSurname(Surname);
		this.setEmailAddress(EmailAddress);
		this.setMobileNumber(MobileNumber);
		this.setHomeAddress(HomeAddress);
		this.setDateOfBirth(DateOfBirth);
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customer_id) {
		this.customerId = customer_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String first_name) {
		this.firstName = first_name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String email_address) {
		this.emailAddress = email_address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String home_address) {
		this.homeAddress = home_address;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String date_of_birth) {
		this.dateOfBirth = date_of_birth;
	}
	
	public void confirmFirstName() {
		if(this.firstName.isBlank())
			throw new RuntimeException("invalid entry for first name, please enter a value for first name");
	}
	
	public void confirmSurname() {
		if(this.surname.isBlank())
			throw new RuntimeException("invalid entry for surname, please enter a value for surname");
	}
	
	public void confirmEmailAddress() {
		if(this.emailAddress.isBlank())
			throw new RuntimeException("invalid entry for email address, please enter a value for email address");
	}
	
	public void confirmMobileNumber() {
		if(this.mobileNumber.isBlank())
			throw new RuntimeException("invalid entry for mobile number, please enter a value for mobile number");
	}
	
	public void confirmHomeAddress() {
		if(this.homeAddress.isBlank())
			throw new RuntimeException("invalid entry for home address, please enter a value for home address");
	}
	
	public void confirmDateOfBirth() {
		if(this.dateOfBirth.isBlank())
			throw new RuntimeException("invalid entry for date of birth, please enter a value for date of birth");
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", surname=" + surname
				+ ", emailAddress=" + emailAddress + ", mobileNumber=" + mobileNumber + ", homeAddress="
				+ homeAddress + ", dateOfBirth=" + dateOfBirth + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
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
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

}