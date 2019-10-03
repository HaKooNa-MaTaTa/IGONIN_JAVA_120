package ru.igonincompany.services;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    public JavaMailSender mailSender;

    @Value("${mail.from}")
    private String mailForm;

    @SneakyThrows
    @Override
    public void sendEmail(String email, String subject, String text) {
        MimeMessage mailMessage = mailSender.createMimeMessage();
        mailMessage.setContent(text, "text/html");
        MimeMessageHelper messageHelper = new MimeMessageHelper(mailMessage, true);
        messageHelper.setTo(email);
        messageHelper.setSubject(subject);
        messageHelper.setText(text, true);
        messageHelper.setFrom(mailForm);
        mailSender.send(mailMessage);
    }
}
