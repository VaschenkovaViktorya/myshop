package product;

import product.Product;

public interface Purchase  {
    default void showInfo(){
        System.out.println("описание товара");
    };
    default void deleteFromBasket(){
        System.out.println("Товар удален из корзины");
    };


}
