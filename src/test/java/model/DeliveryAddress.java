package model;

public class DeliveryAddress {
    private String city;
    private String street;
    private String houseNr;

    public DeliveryAddress(String city, String street, String houseNr) {
        this.city = city;
        this.street = street;
        this.houseNr = houseNr;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNr() {
        return houseNr;
    }

    public void setHouseNr(String houseNr) {
        this.houseNr = houseNr;
    }
}
