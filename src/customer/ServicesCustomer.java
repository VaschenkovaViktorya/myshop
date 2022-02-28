package customer;

import basket.Basket;
import basket.BasketOnSet;
import product.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

//import static com.sun.org.apache.xerces.internal.impl.xpath.regex.CaseInsensitiveMap.updateMap;


//import static fileservice.IOOfBasket.writeBasketToFile;

public abstract class ServicesCustomer {
    // BasketOnList custBasket;
    //BasketOnArray custBasket;
    public BasketOnSet custBasket;
    Basket basket;
    private int i = 0;//для счетчика товаров

    public boolean addToBasket(Product product) {
        if (this.custBasket == null) {
            // custBasket = new BasketOnList();
            // custBasket = new BasketOnArray();
            custBasket = new BasketOnSet();
            basket = new BasketOnSet();
        }
        custBasket.addProduct(product);
        return true;
    }


    public boolean deleteFromBasket(Product product) {
        custBasket.deleteProduct(product);

        return false;
    }


    public boolean showBasket() {
        custBasket.printBasket();
        return false;
    }

    public boolean payOrder() {
        return false;
    }

//    public int getPriceofProductInBasket() {
//        // Product[] basket = custBasket.array;
//        System.out.println("У покупателя " + " в корзине " + i + " товаров");
//        PrintProductInBasket(custBasket.arrayOfProduct);//цикл For
//        findStoimost(custBasket.arrayOfProduct); //цикл while
//        // System.out.println(basket[0].getPrice());
//        return findStoimost(custBasket.arrayOfProduct);
//    }

    private void PrintProductInBasket(Product[] basket) {
        for (int j = 0; j < i; j++) {
            System.out.println(basket[j].getName() + " " + basket[j].getPrice() + " рублей");
        }
    }

    private int findStoimost(Product[] basket) {
        int j = 0;
        int stoimost = 0;
        while (j < i) {
            stoimost += basket[j].getPrice();
            j++;
        }
        System.out.println("Общая стоимость товаров " + stoimost);
        return stoimost;
    }

    public void findProductInBasket(Product product) {
        custBasket.findProduct(product);
    }

//    public void writeToFile(FileWriter fw) throws IOException {
//        fw.write(custBasket.toString());
//        System.out.println("запись прошла");
//    }

    public void saveBasket(String name) {

        custBasket.saveBasketToFile(name);

    }



    public void openBasketFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("testfile/1.txt"))) {
            String currentLine = "";
            System.out.println("вывод содержимого корзины из файла");
            List<Customer> readCustomer =new ArrayList<>();
            while ((currentLine = br.readLine()) != null) {
                //System.out.println(currentLine);
                if (convertStringToCustomer(currentLine)!=null){
                    readCustomer.add(convertStringToCustomer(currentLine));
                }


            }
            System.out.println(readCustomer);
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static Customer convertStringToCustomer(String currentLine){

        if (currentLine!=null&&currentLine.contains("Покупатель")){
            Customer customer = new Customer();
            customer.setName(currentLine.split(" ")[1]);
            return customer;
        }
        return null;
    }

    public void openBasketFromFile2() {
        try (BufferedReader br = new BufferedReader(new FileReader("testfile/1.txt"))) {
            String currentLine = "";
            System.out.println("вывод содержимого корзины из файла");
            Map<Customer, String[]> readCustomer =new HashMap<>();
            while ((currentLine = br.readLine()) != null) {
                //System.out.println(currentLine);
                if (convertStringToCustomer(currentLine)!=null){
                    //readCustomer.put(convertStringToCustomer(currentLine));
                    updateMap(readCustomer, currentLine);
                   //b readCustomer.entrySet()
                }


            }
            System.out.println(readCustomer);
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateMap(Map<Customer, String[]> readCustomer, String currentLine) {
       List <String> product = new ArrayList<>();
       boolean flag= false;
        if (currentLine!=null){
            if (currentLine.contains("Покупатель")){
                Customer customer = new Customer();
                customer.setName(currentLine.split(" ")[1]);
            }
            else if (currentLine.contains("товар")){
                product.add(currentLine);
            }



        }
    }

    private static Customer convertStringToCustomer2(String currentLine){

        if (currentLine!=null&&currentLine.contains("Покупатель")){
            Customer customer = new Customer();
            customer.setName(currentLine.split(" ")[1]);
            return customer;
        }
        return null;
    }


//    public void buyProduct() {
//        System.out.println("*******************************");
//        System.out.println("Покупатель " + " оплатил товары ");
//        int j = 0;
//        do {
//            PrintProductInBasket(custBasket.arrayOfProduct);
//            j++;
//        }
//        while (j < i);
//        findStoimost(custBasket.arrayOfProduct);
//        System.out.println("Приходите к нам еще!)");
//
//    }


}
