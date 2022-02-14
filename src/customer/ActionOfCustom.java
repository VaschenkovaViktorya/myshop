package customer;

import product.Product;

public interface ActionOfCustom {
     boolean addToBasket(Product product);
     boolean deleteFromBasket(Product product);
     boolean payOrder();

}
