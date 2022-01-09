package basket;

import product.Milk;
import product.Product;

public class Basket {
    int id;
    public Product[] array = new Product[5];
    public Basket(){
        System.out.println("Конструктор отработал -корзина для покупателя создана ");
    }
    public void AddProduct(Milk milk){
        System.out.println("товар добавлен");
    }
}
