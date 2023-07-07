package zohoCrmApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zohoCrmApp.entities.Billing;
import zohoCrmApp.entities.Contacts1;
import zohoCrmApp.repositories.ContactRepository1;

@Service
public class ContactServiceImpl implements ContactService1 {
	
	@Autowired
	private ContactRepository1 contactRepo;
	
	public void saveAsContact(Contacts1 con) {
		contactRepo.save(con);
	}

	@Override
	public List<Contacts1> getAllContacts() {
		// TODO Auto-generated method stub
		
		List<Contacts1> allContact = contactRepo.findAll();
		return allContact;
	}

	@Override
	public Contacts1 getContactById(long id) {
		// TODO Auto-generated method stub
		Optional<Contacts1> findById = contactRepo.findById(id);
		Contacts1 contact = findById.get();
		return contact;
	}

	
	
}