package basket;

import product.Milk;
import product.Product;

public class BasketOnArray implements Basket {
    int id;
    public Product[] arrayOfProduct = new Product[10];
    private int indexOfArray = 0;
    private int regenIndexOfArray = 0;

    public BasketOnArray() {
        System.out.println("Конструктор отработал -корзина для покупателя создана ");
    }

    public void AddProduct(Milk milk) {
        System.out.println("товар добавлен");
    }


    @Override
    public boolean addProduct(Product product) {
        if (product != null) {
            if (regenIndexOfArray == 9) {
                Product[] regenArray = new Product[arrayOfProduct.length + 10];
                System.arraycopy(arrayOfProduct, 0, regenArray, 0, arrayOfProduct.length);
                arrayOfProduct = regenArray;
                regenIndexOfArray = 0;
            }
            regenIndexOfArray++;
            arrayOfProduct[indexOfArray++] = product;
            System.out.println(indexOfArray + " товар добавлен " + arrayOfProduct[indexOfArray - 1].getName());

            return true;

        } else {
            System.out.println("Данного товара нет");
        }
        return false;
    }

    @Override
    public boolean deleteProduct(Product product) {
        for (int i = 0; i< arrayOfProduct.length; i++) {
            if (arrayOfProduct[i] == null)
                continue;
            if (arrayOfProduct[i].getName() == product.getName()) {
                System.out.println("товар "+ arrayOfProduct[i].getName()+" удален");
                arrayOfProduct[i]=null;
                break;
            }
        }

        return true;
    }

    @Override
    public boolean clear() {
        return false;
    }

    @Override
    public boolean printBasket() {
        for (Product product : arrayOfProduct) {
            System.out.println("Печать содержимого корзины(Array)");
            if (product==null)
                continue;
            System.out.println("В корзине " +product);
        }

        return false;
    }

    @Override
    public boolean findProduct(Product p) {
        boolean isfinded = false;
        for (Product product:
             arrayOfProduct) {
            if (product==p){
                System.out.println("Товар "+p.getName() +" в корзине (Array) найден ");
                isfinded=true;
                break;
            }
        }
        if (!isfinded) System.out.println("Товар "+p.getName() + " в корзине (Array) не найден");
       return false;
    }

}
