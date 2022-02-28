import catalogofproduct.CatalogOfProduct;
import catalogofproduct.CatalogOfProductInvalidException;
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
        try {
            showCatalog();
        } catch (CatalogOfProductInvalidException e) {
            System.out.println(e.getMessage());;
        }

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

    private static void showCatalog() throws CatalogOfProductInvalidException {

        CatalogOfProduct cat = new CatalogOfProduct();
        if (cat.getCatalog() == null) throw new CatalogOfProductInvalidException("**************Каталог товаров пуст**************");
        else {
            for (String s : cat.getCatalog()) {
                System.out.println(s);
            }
        }

        ;
    }
}
