import catalogofproduct.CatalogOfProduct;
import customer.Customer;
import customer.Vip;
import customer.VipCustomer;
import product.Cheese;
import product.Kefir;
import product.Milk;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        showCatalog();
        Customer vasya = new Customer();
        vasya.addToBasket(new Milk());
        vasya.deleteFromBasket(new Milk());
        vasya.showBasket();
        System.out.println();
        Kefir kefir = new Kefir();
        int a = 0;
        vasya.addToBasket(new Kefir());
        while (a < 12) {
            vasya.addToBasket(kefir);
            a++;
            //  System.out.println(a);
        }
        vasya.addToBasket(new Cheese());
        vasya.saveBasket(vasya.getName());// запись в файл
        vasya.openBasketFromFile(); // чтение из файла
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
