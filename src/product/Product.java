package product;

public class Product {

    public Product(String name) {
        this.name = name;
}

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;

    public void setDescription(String name) {
        this.name = name;
        System.out.println("Описание");
    }


    public void pack(){ System.out.println("Упаковать");}


}
