package com.cursospringboot.cursospringboot.services;

import com.cursospringboot.cursospringboot.domain.Pedido;
import org.springframework.mail.SimpleMailMessage;


public interface EmailService {
    void sendOrderConfirmationEmail(Pedido obj);

    void sendEmail(SimpleMailMessage msg);
}
