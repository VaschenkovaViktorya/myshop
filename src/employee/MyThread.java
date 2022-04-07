package employee;

import catalogofproduct.Catalog;
import catalogofproduct.CatalogTestThread;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class MyThread implements Runnable {
    private Catalog catalog = new CatalogTestThread();
    private Operator operator;
    private List<String> list;

    public MyThread() {
    }

    @Override
    public void run() {
        synchronized (catalog) {

        catalog.createCatalog("Position");
        System.out.println("запись в файл");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(catalog);
        }
    }
}
