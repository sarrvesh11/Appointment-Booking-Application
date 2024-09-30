package com.sarvesh.service;

import com.sarvesh.entity.EmailBody;
import jakarta.mail.MessagingException;

public interface EmailSenderService {

    Boolean sendAppointmentBookingMail(String toEmail, EmailBody emailBody) throws MessagingException;


}
