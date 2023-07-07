package zohoCrmApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import zohoCrmApp.entities.Contacts1;
import zohoCrmApp.services.ContactService1;

@Controller
public class ContactController1 {
	
	@Autowired
	private ContactService1 contactService;
    
	@RequestMapping("/listAllContacts")
	public String getAllContacts(Model model){
		List<Contacts1> allContacts = contactService.getAllContacts();
		model.addAttribute("Contacts1", allContacts);
		
		
		return "list_contacts1";
	}
	
}
