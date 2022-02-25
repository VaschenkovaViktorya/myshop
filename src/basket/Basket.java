package basket;

import product.Product;

public interface Basket {
    boolean addProduct(Product product);
    boolean deleteProduct(Product product);
    boolean clear();
    boolean printBasket();
    boolean findProduct(Product p);
    boolean saveBasketToFile(String name);
}
