package customer;

import product.Kefir;
import product.Milk;

public class TestAPP {
    public static void main(String[] args) {
        Customer customer= new Customer();
        customer.addToBasket(null);
        customer.addToBasket(new Kefir());
        customer.addToBasket(new Milk());
        Customer customer2= new Customer();
        customer2.addToBasket(new Kefir());
        customer2.addToBasket(new Kefir());
        customer2.addToBasket(new Milk());
        System.out.println("ok");
    }

}
