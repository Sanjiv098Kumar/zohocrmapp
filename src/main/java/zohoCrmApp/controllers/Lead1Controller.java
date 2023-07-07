package zohoCrmApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import zohoCrmApp.entities.Contacts1;
import zohoCrmApp.entities.Leads1;
import zohoCrmApp.services.ContactService1;
import zohoCrmApp.services.LeadService;

@Controller
public class Lead1Controller {
	@Autowired
	private LeadService leadService;
	@Autowired
	private ContactService1 contactService;

 
 //	http://localhost:8080/zohocrmapp1/viewCreateLeadPage
	
     @GetMapping("/viewCreateLeadPage")
	  public String viewCreateLead() {
		return "Create_Lead_Page";
	}
     @PostMapping("/save")
    public String saveOneLead(@ModelAttribute("leads") Leads1 lead,Model model) {
    	  leadService.saveOneLead(lead);
    	  model.addAttribute("lead", lead);
    	  return "lead_info";
      }
     
     @RequestMapping("/convertLead")
     public String convertToContact(@RequestParam("id") long id , Model model) {
    	 Leads1 lead = leadService.getLeadById(id);
    	 Contacts1 con  = new Contacts1();
    	   con.setFirstName(lead.getFirstName());
    	   con.setLastName(lead.getLastName());
    	   con.setEmail(lead.getEmail());
    	   con.setMobile(lead.getMobile());
//    	   con.setId(lead.getId());        
    	   con.setSource(lead.getSource());
    	 
    	 contactService.saveAsContact(con);
    	 leadService.deleteLeadById(id);
    	  
    	 List<Contacts1> allContacts = contactService.getAllContacts();
    	  model.addAttribute("Contacts1", allContacts);
    	return "list_contacts1";
     }
     @RequestMapping("/listLeads")
     public String listLeads(Model model) {
    	 List<Leads1> lead = leadService.getAllLeads();
    	 model.addAttribute("leads", lead);
    	 return "list_leads1"; 
     }
     
     @RequestMapping("/leadInfo")
     public String getLeadById(@RequestParam("id") long id, Model model) {
    	 Leads1 lead = leadService.getLeadById(id);
    	 model.addAttribute("lead",lead );
    	 return "lead_info";
     }
     
     
     
}
