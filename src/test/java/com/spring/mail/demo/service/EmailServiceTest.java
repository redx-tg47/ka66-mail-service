package com.spring.mail.demo.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class EmailServiceTest {

  @Mock
  private JavaMailSender mailSender;

  @InjectMocks
  private EmailService emailService;

  @Captor
  private ArgumentCaptor<SimpleMailMessage> messageCaptor;

  @Test
  void testSendSimpleEmail() {
    String to = "test@example.com";
    String subject = "Test Subject";
    String text = "Test Message";

    emailService.sendSimpleEmail(to, subject, text);

    verify(mailSender).send(messageCaptor.capture());
    SimpleMailMessage sentMessage = messageCaptor.getValue();

    assertEquals(to, Objects.requireNonNull(sentMessage.getTo())[0]);
    assertEquals(subject, sentMessage.getSubject());
    assertEquals(text, sentMessage.getText());
  }

}