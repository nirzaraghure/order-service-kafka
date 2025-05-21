package com.nirzara.ordermanagement.order_service.Model;

public class      Order {
    private String orderId;
    private String userId;
    private double amount;
    private String status;  // PENDING, PAID, SHIPPED

    public Order() {
    }

    public Order(String orderId, String userId, double amount, String status) {
        this.orderId = orderId;
        this.userId = userId;
        this.amount = amount;
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
