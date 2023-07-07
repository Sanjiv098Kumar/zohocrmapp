package zohoCrmApp.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import zohoCrmApp.entities.Billing;
import zohoCrmApp.entities.Contacts1;


public interface ContactService1 {

	void saveAsContact(Contacts1 con);

	List<Contacts1> getAllContacts();

	Contacts1 getContactById(long id);

	

	

}
