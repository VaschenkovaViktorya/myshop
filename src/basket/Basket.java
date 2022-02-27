package basket;

import product.Product;

import java.io.FileWriter;

public interface Basket {
    boolean addProduct(Product product);
    boolean deleteProduct(Product product);
    boolean clear();
    boolean printBasket();
    boolean findProduct(Product p);
    boolean saveBasketToFile(String name);

}
