package customer;

import basket.BasketOnArray;
import product.Product;

public abstract class ServicesCustomer {
    BasketOnArray custBasket;
    private int i = 0;//для счетчика товаров

    public boolean addToBasket(Product product) {
        if (this.custBasket == null) {
           custBasket = new BasketOnArray();
            i = 0;
            System.out.println("корзина создана");
        }
        custBasket.addProduct(product);
        return true;
    }

    public boolean deleteFromBasket(Product product) {
        return false;
    }


    public boolean payOrder() {
        return false;
    }

    public int getPriceofProductInBasket() {
        // Product[] basket = custBasket.array;
        System.out.println("У покупателя " + " в корзине " + i + " товаров");
        PrintProductInBasket(custBasket.array);//цикл For
        findStoimost(custBasket.array); //цикл while
        // System.out.println(basket[0].getPrice());
        return findStoimost(custBasket.array);
    }

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

    public void buyProduct() {
        System.out.println("*******************************");
        System.out.println("Покупатель " + " оплатил товары ");
        int j = 0;
        do {
            PrintProductInBasket(custBasket.array);
            j++;
        }
        while (j < i);
        findStoimost(custBasket.array);
        System.out.println("Приходите к нам еще!)");

    }


}
