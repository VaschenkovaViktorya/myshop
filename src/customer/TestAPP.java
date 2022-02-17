package customer;

import product.Kefir;
import product.Milk;
import product.Product;

public class TestAPP {

    public static void main(String[] args) {
        System.out.println();
        Customer customer = new Customer();
        customer.addToBasket(null);
        Kefir kefir = new Kefir();
        int a = 0;
        customer.addToBasket(new Kefir());
        while (a < 12) {
            customer.addToBasket(new Milk());
            a++;
            //  System.out.println(a);
        }
        customer.addToBasket(kefir);
        customer.showBasket();
        customer.deleteFromBasket(kefir);
        // customer.findProductInBasket(kefir);
        customer.showBasket();
        System.out.println();
//customer.deleteFromBasket(kefir);
    }

}
