package zohoCrmApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import zohoCrmApp.entities.Billing;
import zohoCrmApp.entities.Contacts1;
import zohoCrmApp.services.BillingService;
import zohoCrmApp.services.ContactService1;

@Controller
public class BillingController {
	@Autowired
	private ContactService1 contactService;
	@Autowired
	private BillingService  billingService;

	@RequestMapping("/generateBill")
	public String viewBillingPage(@RequestParam("id") long id, Model model) {
		
		Contacts1  contact = contactService.getContactById(id);
		model.addAttribute("contact", contact);
		return"generate_bills";
	}
	@RequestMapping("/saveBill")
	public String saveBill(@ModelAttribute("bill") Billing bill, Model model) {
		Billing newbill = billingService.saveBill(bill);
		model.addAttribute("bill",newbill);
		return "bill_created";
	}
}
