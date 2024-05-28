package cs320projectone;

import java.util.ArrayList;
import java.util.List;

public class Contact {
	private String id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	private static List<String> allIds = new ArrayList<>();
	
	public Contact(String id, String firstName, String lastName, String phoneNumber, String address) {
		if (allIds.contains(id)) {
			throw new IllegalArgumentException("ID exists. Please use a different ID");
		}
		if (id == null || id.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if (firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid firstName");
		}
		if (lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid lastName");
		}
		if (phoneNumber == null || phoneNumber.length()!=10) {
			throw new IllegalArgumentException("Invalid phoneNumber");
		}
		if (address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		this.id = id;
		allIds.add(id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		
	}

	public String getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
		
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setFirstName(String uFirstName) {
		this.firstName = uFirstName;
	}
	
	public void setLastName(String uLastName) {
		this.lastName = uLastName;
	}
	
	public void setPhoneNumber(String uPhoneNumber) {
		this.phoneNumber = uPhoneNumber;
	}
	
	public void setAddress(String uAddress) {
		this.address = uAddress;
	}
}