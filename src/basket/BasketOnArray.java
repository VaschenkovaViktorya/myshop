package basket;

import product.Milk;
import product.Product;

public class BasketOnArray implements Basket {
    int id;
    public Product[] array = new Product[5];

    public BasketOnArray() {
        System.out.println("Конструктор отработал -корзина для покупателя создана ");
    }

    public void AddProduct(Milk milk) {
        System.out.println("товар добавлен");
    }

    int i = 0;

    @Override
    public boolean addProduct(Product product) {

        if (product != null) {
            array[i] = product;
            i++;
            System.out.println( i + " " + array[i]);
            return true;

        } else {
            System.out.println("Данного товара нет");
        }
        return false;
    }

    @Override
    public boolean deleteProduct() {
        return false;
    }

    @Override
    public boolean clear() {
        return false;
    }

}
