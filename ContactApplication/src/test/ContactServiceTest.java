package test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cs320projectone.Contact;
import cs320projectone.ContactService;

class ContactServiceTest {

	@Test
	void testAddContact() {
		ContactService contactService = new ContactService();
		contactService.addContact("2", "March", "7th", "7777777777", "77 Astral Express Lane");
		assertEquals(contactService.contactList.size(), 1);
	}
	
	@Test
	void testUpdateContact() {
		ContactService contactService = new ContactService();
		contactService.addContact("1", "Yuu", "Koito", "5555555555", "64 Yagakimi Circle");
		contactService.updateContact("1", "Touko", "Nanami", "5555555557", "88 Bloom Drive");
		Contact updatedContact = contactService.contactList.get(0);
		assertEquals(updatedContact.getFirstName(), "Touko");
		assertEquals(updatedContact.getLastName(), "Nanami");
		assertEquals(updatedContact.getPhoneNumber(), "5555555557");
		assertEquals(updatedContact.getAddress(), "88 Bloom Drive");
	}
	
	@Test
	void testDeleteContact() {
		ContactService contactService = new ContactService();
		contactService.addContact("3", "Yuu", "Koito", "5555555555", "64 Yagakimi Circle");
		contactService.addContact("4", "March", "7th", "7777777777", "77 Astral Express Lane");
		assertEquals(contactService.contactList.size(), 2);
		contactService.deleteContact("4");
		assertEquals(contactService.contactList.size(), 1);
		
	}
	

}
