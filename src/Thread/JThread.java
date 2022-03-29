package Thread;

import catalogofproduct.CatalogOfProduct;
import org.w3c.dom.ls.LSOutput;

import static java.lang.Thread.*;

public class JThread extends Thread {
    private CatalogOfProduct catalog;

    public JThread(String threadName) {
        super(threadName);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " Запущен");
        System.out.println("*********************Откроем каталог для клиента*******************************");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        catalog = new CatalogOfProduct();
        catalog.openCatalog();

        System.out.println(Thread.currentThread().getName() + " Завершен");
    }

}
