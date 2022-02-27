package basket;

import product.Product;

import java.io.FileWriter;
import java.util.ArrayList;

public class BasketOnList implements Basket{
ArrayList<Product> listOfProduct = new ArrayList<Product>();
    @Override
    public boolean addProduct(Product product) {
        listOfProduct.add(product);
        System.out.println("Товар добавлен "+product);
        //System.out.println(arrayOfProduct.size());
        return false;
    }

    @Override
    public boolean deleteProduct(Product product) {
        listOfProduct.remove(product);
        System.out.println("Товар " +product+" удален из корзины");
        return false;
    }

    @Override
    public boolean clear() {
        return false;
    }

    @Override
    public boolean printBasket() {
        System.out.println("Печать содержимого корзины(Arraylist)");
      //  System.out.println(arrayOfProduct);
        for (Product product: listOfProduct
             ) {
            if (product==null)
                continue;
            System.out.println("В корзине " + product);
        }
        return false;
    }

    @Override
    public boolean findProduct(Product product) {
        if (listOfProduct.contains(product)){
            System.out.println("Данный товар есть в корзине " + product);
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
                    listOfProduct) {
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
}
