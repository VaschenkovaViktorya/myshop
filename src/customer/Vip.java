package customer;

public interface Vip extends ActionOfCustom {
    default void useDiscount() {
        System.out.println("применена скидка для заказа");
    }
}
