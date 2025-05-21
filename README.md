# 🛒 Order Service - Kafka Event Producer

This is a simple Spring Boot microservice that accepts order requests and sends order events to a Kafka topic. It demonstrates how microservices can communicate using Apache Kafka.

## 💡 What This Project Does

- Accepts order details via REST API.
- Publishes an order-created event to a Kafka topic.
- Stores order data temporarily using an in-memory map.

---

## ⚙️ Tech Stack

- **Java 17**
- **Spring Boot**
- **Apache Kafka**
- **Docker & Docker Compose**
- **Postman (for API testing)**

---

## 🚀 How to Run

### 1. Start Kafka and Zookeeper (via Docker)

```bash
docker-compose up
