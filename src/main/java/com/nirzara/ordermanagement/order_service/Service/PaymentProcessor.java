package com.nirzara.ordermanagement.order_service.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentProcessor {

    @KafkaListener(topics = "orders", groupId = "payment-group")
    public void processOrder(String orderMessage) {
        System.out.println("💰 Processing payment for: " + orderMessage);

        // Simulate payment
        try {
            Thread.sleep(1000); // simulate delay
            System.out.println("✅ Payment completed for: " + orderMessage);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
