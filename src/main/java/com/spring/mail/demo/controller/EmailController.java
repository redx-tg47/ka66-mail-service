package com.spring.mail.demo.controller;

import com.spring.mail.demo.service.EmailService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mail")
@Tag(name = "Email", description = "The Email API")
public class EmailController {

  private final EmailService emailService;

  public EmailController(EmailService emailService) {
    this.emailService = emailService;
  }

  @GetMapping("/send")
  @Operation(summary = "Send an email")
  public String sendEmail(@RequestParam String to,
                          @RequestParam String subject,
                          @RequestParam String text) {
    emailService.sendSimpleEmail(to, subject, text);
    return "Email sent successfully!";
  }

}