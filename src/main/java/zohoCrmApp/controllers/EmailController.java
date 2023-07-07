package zohoCrmApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import zohoCrmApp.Email.Email1;
import zohoCrmApp.util.EmailService;

@Controller
public class EmailController {
    @Autowired
	private EmailService emailService;
	@PostMapping("/sendEmail")
	public String sendEmail(@RequestParam("email") String email,Model model) {
		 model.addAttribute("email", email);
		 return "compose_email";
	}
	@PostMapping("/triggerEmail")
	public String emailTrigger( Email1 email,Model model) {
		emailService.sendEmail(email.getTo(),email.getSubject(),email.getContent());
		model.addAttribute("msg", "email sent");
		return "compose_email";
	}
}
