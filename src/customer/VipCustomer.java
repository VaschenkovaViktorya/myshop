package customer;

import product.Product;

public class VipCustomer extends Customer {

    public void useDiscount() {
        System.out.println("сработал вип");
    }
}
