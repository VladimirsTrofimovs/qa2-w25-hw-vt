package model;

public class Order {
    private int orderId;
    private Customer customerId;
    private Product products;
    private DeliveryAddress delivery;

    public Order(int orderId, Customer customerId, Product products, DeliveryAddress delivery) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.products = products;
        this.delivery = delivery;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }

    public DeliveryAddress getDelivery() {
        return delivery;
    }

    public void setDelivery(DeliveryAddress delivery) {
        this.delivery = delivery;
    }
}
