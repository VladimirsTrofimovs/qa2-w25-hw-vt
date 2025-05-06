package model;

public class Customer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private CustomerAddress customerAddress;
    private DeliveryAddress deliveryAddress;

    public Customer(int customerId, String firstName, String lastName, String email, String phone, CustomerAddress customerAddress, DeliveryAddress deliveryAddress) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.customerAddress = customerAddress;
        this.deliveryAddress = deliveryAddress;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public CustomerAddress getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(CustomerAddress customerAddress) {
        this.customerAddress = customerAddress;
    }

    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
