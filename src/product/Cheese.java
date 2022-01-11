package product;

public class Cheese extends Product {
    private String name;
    private   double size;
    private double price;
    private String shelfLife;
    private int total;

    public Cheese(String name, double size, double price, String shelfLife, int total) {
        super(name);
        this.name = name;
        this.size = size;
        this.price = price;
        this.shelfLife = shelfLife;
        this.total = total;
    }
    public Cheese(String name){
        super();
    }
    public void setDescription(String name, String shelfLife) {
        this.name = name;
        this.shelfLife = shelfLife;
        System.out.println(name + " хранить в холодильнике до: " + shelfLife + "," + " готово к употреблению");
    }
    public String getName() {
        return name;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public String getShelfLife() {
        return shelfLife; }

    public void setPrice(double price) {               //if - else
        this.price = price;
        if (price >= 200) {
            System.out.println(price + " рублей");
        } else {
            System.out.println("Акция: " + price + " рублей");
        }
    }

    public void cut() {
        System.out.println("Нарезaть: " + name);
    }
    public void pack() {
        System.out.println("Упаковать в пленку: " + name);
    }
    }
