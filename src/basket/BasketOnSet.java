package basket;

import product.Product;

import java.io.FileWriter;
import java.util.HashSet;
import java.util.Set;

public class BasketOnSet implements Basket {
    Set<Product> setOfProduct = new HashSet<>();
    @Override
    public boolean addProduct(Product product) {
        setOfProduct.add(product);
        System.out.println("Товар добавлен "+product);
        return false;
    }

    @Override
    public boolean deleteProduct(Product product) {
        setOfProduct.remove(product);
        return false;
    }

    @Override
    public boolean clear() {
        return false;
    }

    @Override
    public boolean printBasket() {
        System.out.println("Печать содержимого корзины(HashSet)");
        //  System.out.println(arrayOfProduct);
        for (Product product: setOfProduct
        ) {
            if (product==null)
                continue;
            System.out.println("В корзине " + product);
        }
        return false;
    }

    @Override
    public boolean findProduct(Product p) {
        if (setOfProduct.contains(p)){
            System.out.println("Данный товар есть в корзине " + p);
            return true;
        }
        System.out.println("Товар не найден");
        return false;
    }

    @Override
    public boolean saveBasketToFile(String name) {
        try (FileWriter fw = new FileWriter("testfile/1.txt",true)){
            fw.write("Покупатель "+name+"\n");
            for (Product p:
                    setOfProduct) {
                if (p==null) continue;
                fw.write("товар "+p.getName() + " "+"цена "+p.getPrice()+"\n");
                System.out.println();
            }
            fw.flush();
            System.out.println("запись прошла");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    void writeTofile(){
        for (Product p:setOfProduct) {

        }
    }
    @Override
    public String toString() {
        return
                "setOfProduct=" + setOfProduct;
    }
}
