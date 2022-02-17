package customer;

import basket.BasketOnArray;
import basket.BasketOnList;
import product.Kefir;
import product.Product;

public abstract class ServicesCustomer {
   BasketOnList custBasket;
   // BasketOnArray custBasket;
    private int i = 0;//для счетчика товаров

    public boolean addToBasket(Product product) {
        if (this.custBasket == null) {
           custBasket = new BasketOnList();
          // custBasket = new BasketOnArray();
        }
        custBasket.addProduct(product);
        return true;
    }

    public boolean deleteFromBasket(Product product) {
        custBasket.deleteProduct(product);

        return false;
    }


   boolean showBasket() {
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
