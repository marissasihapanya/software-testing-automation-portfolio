package cs320projectone;
import java.util.ArrayList;
import java.util.List;

public class ContactService {
	
	public List<Contact> contactList = new ArrayList<Contact>();
	
	public void addContact(String id, String firstName, String lastName, String phoneNumber, String address) {
		Contact newContact = new Contact(id, firstName, lastName, phoneNumber, address);
		contactList.add(newContact);
	}

	public void updateContact(String id, String uFirstName, String uLastName, String uPhoneNumber, String uAddress) {
		for (Contact contact : contactList) {
			if (contact.getId().equals(id)) {
				contact.setFirstName(uFirstName);
				contact.setLastName(uLastName);
				contact.setPhoneNumber(uPhoneNumber);
				contact.setAddress(uAddress);
			}
		}
	}

	public void deleteContact(String id) {
		for (Contact contact : contactList) {
			if (contact.getId().equals(id)) {
				contactList.remove(contact);
				return;
			}
		}
	}
}

