package com.sarvesh.service;

import com.sarvesh.entity.EmailBody;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderServiceImpl implements EmailSenderService{

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public Boolean sendAppointmentBookingMail(String toEmail, EmailBody emailBody) throws MessagingException {

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

        simpleMailMessage.setFrom("temp131102@gmail.com");

        simpleMailMessage.setTo(toEmail);
        simpleMailMessage.setText(emailBody.getEmailBody());
        simpleMailMessage.setSubject(emailBody.getEmailSubject());

        javaMailSender.send(simpleMailMessage);


        return true;

    }

}