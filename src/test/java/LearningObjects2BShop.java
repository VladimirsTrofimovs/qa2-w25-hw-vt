import model.Customer;
import model.CustomerAddress;
import model.DeliveryAddress;
import model.Product;
import org.junit.jupiter.api.Test;

public class LearningObjects2BShop {
    @Test
    public void makingOrdersTest() {
        Product bread = new Product(12345, "Bread");
        Product milk = new Product(12346, "Milk");
        Product sausages = new Product(12347, "Sausages");
        Product beer = new Product(12348, "Beer");
        Product potatoes = new Product(12349, "Potatoes");
        Product butter = new Product(12350, "Butter");
        Product oil = new Product(12351, "Oil");
        Product nuts = new Product(12352, "Nuts");
        Product cookies = new Product(12353, "Cookies");
        Product cheese = new Product(12354, "Cheese");

        CustomerAddress andrisAddress = new CustomerAddress("Riga", "Akas", "11");
        CustomerAddress baibaAddress = new CustomerAddress("Liepaja", "Rigas", "22a");
        CustomerAddress janisAddress = new CustomerAddress("Valka", "Ludzas", "33");

        DeliveryAddress andrisDelivery = new DeliveryAddress("Riga", "Tvaika", "55");
        DeliveryAddress baibaDelivery = new DeliveryAddress("Liepaja", "Rigas", "22a");
        DeliveryAddress janisDelivery = new DeliveryAddress("Valka", "Ludzas", "33");

        Customer andris = new Customer(98765, "Andris", "Lusis", "andrisl@mail.com", "+371 23535353", andrisAddress, andrisDelivery);
        Customer baiba = new Customer(98766, "Baiba", "Kraukle", "baibak@mail.com", "+371 25454545", baibaAddress, baibaDelivery);
        Customer janis = new Customer(98767, "Janis", "Silins", "janiss@mail.com", "+371 28787878", janisAddress, janisDelivery);


    }
}
