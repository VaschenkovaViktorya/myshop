import catalogofproduct.CatalogOfProduct;
import customer.Customer;
import customer.Vip;
import customer.VipCustomer;
import product.Kefir;
import product.Milk;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        showCatalog();
        Customer vasya = new Customer();
        vasya.addToBasket(new Milk());
        System.out.println();
    }

    private static void showCatalog() {
        CatalogOfProduct cat = new CatalogOfProduct();
        cat.getCatalog();
        for (String s : cat.getCatalog()) {
            System.out.println(s);
        }
        ;
    }
}
