package com.nirzara.ordermanagement.order_service.Controller;

import com.nirzara.ordermanagement.order_service.Model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "order-created";

    private Map<String, Order> orders = new HashMap<>();

    @PostMapping
    public String createOrder(@RequestBody Order order) {
        order.setStatus("PENDING");
        orders.put(order.getOrderId(), order);

        // Create a simple JSON string to publish
        String message = String.format("{\"orderId\":\"%s\",\"userId\":\"%s\",\"amount\":%.2f}",
                order.getOrderId(), order.getUserId(), order.getAmount());

        kafkaTemplate.send(TOPIC, message);

        return "Order created successfully and event published to Kafka!";
    }

    @GetMapping("/{orderId}")
    public Order getOrder(@PathVariable String orderId) {
        return orders.get(orderId);
    }
}
