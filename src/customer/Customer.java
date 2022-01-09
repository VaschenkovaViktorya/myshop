package customer;

import basket.Basket;
import product.Product;
import store.Store;

public class Customer {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private int i = 0;//для счетчика товаров
    Basket custBasket;

    public Customer() {
        name = "Вася";
        custBasket = null;
    }

    public Basket createBasket() {
        Basket custBasket = new Basket();
        return custBasket;
    }

    public void addToBascket(Product product) {

        if (this.custBasket == null) {
            custBasket = createBasket();
            i = 0;
            System.out.println("корзина создана");
        }

        System.out.println("товар добавлен " + product.getName());

        if (product != null) {
            listOfProduts(product);
        }


    }

    private void listOfProduts(Product product) {
        custBasket.array[i++] = product;
        System.out.println(i);
    }

    public void getPriceofProductinBasket() {
       // Product[] basket = custBasket.array;
        System.out.println("У покупателя " + this.getName() + " в корзине " + i + " товаров");
        PrintProductInBasket(custBasket.array);//цикл For
        findStoimost(custBasket.array); //цикл while
        // System.out.println(basket[0].getPrice());

    }

    private void PrintProductInBasket(Product[] basket) {
        for (int j = 0; j < i; j++) {
            System.out.println(basket[j].getName() + " " + basket[j].getPrice() + " рублей");
        }
    }

    private void findStoimost(Product[] basket) {
        int j = 0;
        int stoimost = 0;
        while (j < i) {
            stoimost += basket[j].getPrice();
            j++;
        }
        System.out.println("Общая стоимость товаров " + stoimost);
    }

    public void buyProduct() {
        System.out.println("*******************************");
        System.out.println("Покупатель "+ this.getName()+" оплатил товары ");
        int j = 0;
do {
    PrintProductInBasket(custBasket.array);
    j++;
}
    while(j<i);
        findStoimost(custBasket.array);
        System.out.println("Приходите к нам еще!)");

    }
}
