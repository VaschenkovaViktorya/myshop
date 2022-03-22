import catalogofproduct.Catalog;
import catalogofproduct.CatalogOfProduct;
import catalogofproduct.CatalogOfProductInvalidException;
import catalogofproduct.CatalogOnList;
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
//        try {
//            CatalogOfProduct.showCatalog();
//        } catch (CatalogOfProductInvalidException e) {
//            System.out.println(e.getMessage());;
//        }
// Пример паттерна Singleton
        Catalog catalog = CatalogOnList.getInstance();
        catalog.showCatalog();
        Catalog catalog2 = CatalogOnList.getInstance();
        catalog2.showCatalog();
        catalog.createCatalog();
        // -----Пример паттерна Singleton
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
        vasya.openBasketFromFile2();
    }


}
