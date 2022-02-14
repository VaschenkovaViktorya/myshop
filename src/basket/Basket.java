package basket;

import product.Product;

public interface Basket {
    boolean addProduct(Product product);
    boolean deleteProduct();
    boolean clear();
}
