package customer;

public interface Vip extends ActionOfCustom {
    default void useDiscount() {
        System.out.println("применена скидка для заказа");
    }

    @Override
    default boolean showBasket() {
        return false;
    }
}
