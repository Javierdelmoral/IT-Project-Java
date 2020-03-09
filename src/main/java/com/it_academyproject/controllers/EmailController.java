package com.it_academyproject.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.PostMapping;  // JUST FOR TEST PURPOSES
import org.springframework.web.bind.annotation.RestController;



import com.it_academyproject.services.EmailService;

@RestController
public class EmailController {

	@Autowired
	public EmailService emailService;

	//	@PostMapping("/api/emails/notification") // JUST FOR TEST PURPOSES. TO TEST THIS CALL YOU HAVE TO EDIT THE COURSE TABLE (END DATE TO 15 DAYS OR 30 DAYS FROM NOW)
	@Scheduled(cron = "0 0 9 * * ?")
	public void sendMail() throws Exception {		

		emailService.notificationEmailAbsence();
		emailService.notificationEmailDaysLeft();

		//		return "Successfully sent email";   // JUST FOR TEST PURPOSES
	}


}