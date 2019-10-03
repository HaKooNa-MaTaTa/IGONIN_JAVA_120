package ru.igonincompany.services;

public interface EmailService {
    void sendEmail(String email, String subject, String text);
}
