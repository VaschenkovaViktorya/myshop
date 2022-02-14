package customer;

import basket.BasketOnArray;

public class Customer extends ServicesCustomer {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    BasketOnArray custBasket;

    public Customer() {
        name = "Вася";
        custBasket = null;
    }


}
