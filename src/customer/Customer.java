package customer;

import basket.BasketOnList;

public class Customer extends ServicesCustomer {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    BasketOnList custBasket;

    public Customer() {
        name = "Вася";
        custBasket = null;
    }


}
