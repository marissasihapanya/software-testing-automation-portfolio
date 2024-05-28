package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import cs320projectone.Contact;

class ContactTest {

	@Test
	void testContact() {
		String id = "222";
		String firstName = "Kafka";
		String lastName = "Hime";
		String phoneNumber = "8888888888";
		String address = "1234 Star Rail Drive";
		Contact contact = new Contact(id, firstName, lastName, phoneNumber, address);
		assertEquals(id, contact.getId());
		assertEquals(firstName, contact.getFirstName());
		assertEquals(lastName, contact.getLastName());
		assertEquals(phoneNumber, contact.getPhoneNumber());
		assertEquals(address, contact.getAddress());
	}
	
	@Test
	void testContactIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Kafka", "Hime", "8888888888", "1234 Star Rail Drive");
		}); 
	}
	
	@Test
	void testContactFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", null, "Hime", "8888888888", "1234 Star Rail Drive");
		}); 
	}
	
	@Test
	void testContactLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("2", "Kafka", null, "8888888888", "1234 Star Rail Drive");
		}); 
	}
	
	@Test
	void testContactPhoneNumberIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("3", "Kafka", "Hime", null, "1234 Star Rail Drive");
		}); 
	}
	
	@Test
	void testContactAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("4", "Kafka", "Hime", "8888888888", null);
		}); 
	}
	
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("11111111111111111", "Kafka", "Hime", "8888888888", "1234 Star Rail Drive");
		}); }
	
	@Test
	void testContactIdEqualTo10() {
		Contact contact = new Contact("1111111111", "Kafka", "Hime", "8888888888", "1234 Star Rail Drive");
		assertEquals(10, contact.getId().length(), "Contact ID equal to 10");

	}
	
	@Test
	void testContactIdLessThan10() {
		Contact contact = new Contact("1111", "Jing", "Liu", "8888888889", "777 Xianzhou Street");
		assertTrue(contact.getId().length() < 10, "Contact ID less than 10");
	}
	
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("5", "Kafka123456", "Hime", "8888888888", "1234 Star Rail Drive");
		}); }
	
	@Test
	void testContactFirstNameLessThan10() {
		Contact contact = new Contact("1112", "Jing", "Liu", "8888888889", "777 Xianzhou Street");
		assertTrue(contact.getFirstName().length() < 10, "Contact first name less than 10");
	}
	
	@Test
	void testContactFirstNameIs10() {
		Contact contact = new Contact("1113", "Jing123456", "Liu", "8888888889", "777 Xianzhou Street");
		assertEquals(10, contact.getFirstName().length(), "First name is 10");
		
	}

	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("6", "Kafka", "Hime1234567", "8888888888", "1234 Star Rail Drive");
		}); }
	
	@Test
	void testContactLastNameLessThan10() {
		Contact contact = new Contact("1114", "Jing", "Liu", "8888888889", "777 Xianzhou Street");
		assertTrue(contact.getLastName().length() < 10, "Contact last name less than 10");
		
	}
	
	@Test
	void testContactLastNameIs10() {
		Contact contact = new Contact("1115", "Jing", "Liu1234567", "8888888889", "777 Xianzhou Street");
		assertEquals(10, contact.getLastName().length(), "Last name is 10");
		
	}
	
	@Test
	void testContactPhoneNumberEqualTo10() {
		Contact contact = new Contact("1116", "Kafka", "Hime", "8888888888", "1234 Star Rail Drive");
		assertEquals(10, contact.getPhoneNumber().length(), "Contact last name equal to 10");
	}
	
	
	@Test
	void testContactPhoneNumberNotTen() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("7", "Kafka", "Hime", "8888", "1234 Star Rail Drive");
		}); }
	
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("8", "Kafka", "Hime", "8888888888", "1234 Star Rail Drive TestCharacterFiller");
		}); }
	
	@Test
	void testContactAddressLessThan30() {
		Contact contact = new Contact("2214", "Jing", "Liu", "8888888889", "777 Xianzhou Street");
		assertTrue(contact.getAddress().length() < 30, "Address less than 30");
	}
	
	@Test
	void testContactAddressIs30() {
		Contact contact = new Contact("2215", "Jing", "Liu", "8888888889", "777 Xianzhou Street11111111111");
		assertEquals(30, contact.getAddress().length(), "Address is 30");
		
	}
	
	@Test
	void testContactIdUnique() {
		Contact contact1 = new Contact("10", "Jing", "Liu", "8888888889", "777 Xianzhou Street");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("10", "Kafka", "Hime", "8888888888", "1234 Star Rail Drive");
		}); 
		
	}
	
	
	@Test
	void testSetContactFirstName() {
		Contact contact2 = new Contact("11", "Jing", "Liu", "8888888889", "777 Xianzhou Street");
		String newFirstName = "Fu";
		contact2.setFirstName(newFirstName);
		assertEquals(newFirstName, contact2.getFirstName());
	}
	
	@Test
	void testSetContactLastName() {
		Contact contact3 = new Contact("12", "Jing", "Liu", "8888888889", "777 Xianzhou Street");
		String newLastName = "Fu";
		contact3.setLastName(newLastName);
		assertEquals(newLastName, contact3.getLastName());
	}
	
	@Test
	void testSetContactPhoneNumber() {
		Contact contact = new Contact("13", "Jing", "Liu", "8888888889", "777 Xianzhou Street");
		String newPhoneNumber = "8888888881";
		contact.setPhoneNumber(newPhoneNumber);
		assertEquals(newPhoneNumber, contact.getPhoneNumber());
	}
	
	@Test
	void testSetContactAddress() {
		Contact contact = new Contact("14", "Jing", "Liu", "8888888889", "777 Xianzhou Street");
		String newAddress = "789 Xianzhou Street";
		contact.setAddress(newAddress);
		assertEquals(newAddress, contact.getAddress());
	}
	
	@Test
	void testGetContactId() {
		String id = "15";
		Contact contact = new Contact(id, "Jing", "Liu", "8888888889", "777 Xianzhou Street");
		String returnedId = contact.getId();
		assertEquals(id, returnedId);
	}
	
	@Test
	void testGetContactFirstName() {
		String firstName = "Fu";
		Contact contact = new Contact("16", firstName, "Liu", "8888888889", "777 Xianzhou Street");
		String returnedFirstName = contact.getFirstName();
		assertEquals(firstName, returnedFirstName);
	}
	
	@Test
	void testGetContactLastName() {
		String lastName = "Xuan";
		Contact contact = new Contact("17", "Jing", lastName, "8888888889", "777 Xianzhou Street");
		String returnedLastName = contact.getLastName();
		assertEquals(lastName, returnedLastName);
	}
	
	@Test
	void testGetContactPhoneNumber() {
		String phoneNumber = "8888888889";
		Contact contact = new Contact("18", "Jing", "Liu", "8888888889", "777 Xianzhou Street");
		String returnedPhoneNumber = contact.getPhoneNumber();
		assertEquals(phoneNumber, returnedPhoneNumber);
	}
	
	@Test
	void testGetContactAddress() {
		String address = "777 Xianzhou Street";
		Contact contact = new Contact("19", "Jing", "Liu", "8888888889", address);
		String returnedAddress = contact.getAddress();
		assertEquals(address, returnedAddress);
	}
	
	
}



