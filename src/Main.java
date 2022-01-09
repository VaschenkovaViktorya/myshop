import customer.Customer;
import product.Kefir;
import product.Milk;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        // CatalogOfProduct.openCatalog();
        Customer vasya= new Customer();
        Customer vasya1= new Customer();
        Milk milk= new Milk();
        vasya.addToBascket(milk);
        vasya.addToBascket(milk);
        vasya.addToBascket(milk);
        vasya.addToBascket(new Kefir());;
        vasya1.addToBascket(milk);
        vasya1.addToBascket(new Kefir());
        vasya.getPriceofProductinBasket();
        vasya1.getPriceofProductinBasket();
        vasya1.buyProduct();
        System.out.println();
    }
}
