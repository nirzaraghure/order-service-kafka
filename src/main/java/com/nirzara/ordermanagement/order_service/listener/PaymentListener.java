package com.nirzara.ordermanagement.order_service.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentListener {

    @KafkaListener(topics = "order-topic", groupId = "payment-group")
    public void handleOrder(String orderMessage) {
        System.out.println("📩 Received Order Message: " + orderMessage);

        // Simulate payment processing
        System.out.println("💳 Processing payment for: " + orderMessage);

        // Simulate delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("✅ Payment successful for: " + orderMessage);
    }
}
