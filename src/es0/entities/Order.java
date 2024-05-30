package es0.entities;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class Order {
private long id;
private String status;
private LocalDate orderDate;
private LocalDate deliveryDate;
private List<Product> products;
private Customer customer;

    public Order(String status, List<Product> products, Customer customers, LocalDate date) {
        Random random = new Random();
        this.id = random.nextLong(499999999999L, 599999999999L);
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.products = products;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", products=" + products +
                ", customer=" + customer +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }

}
