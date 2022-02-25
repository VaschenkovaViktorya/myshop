package fileservice;

import customer.Customer;
import product.Kefir;

import java.util.Scanner;

public class TestFileRW {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.addToBasket(null);
        Kefir kefir = new Kefir();
        int a = 0;
        customer.addToBasket(new Kefir());
        while (a < 12) {
            customer.addToBasket(kefir);
            a++;
            //  System.out.println(a);
        }
        customer.addToBasket(kefir);
        Scanner sc= new Scanner(System.in);
        int choise = sc.nextInt();
        if (choise==1){
            //writeBasketToFile(customer);
            customer.saveBasket(customer.getName());
        }
    }


}
