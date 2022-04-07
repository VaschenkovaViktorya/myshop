package employee;

import catalogofproduct.CatalogTestThread;

import java.util.ArrayList;

public class TestApp {
    public static void main(String[] args) {
        MyThread task = new MyThread();
        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();
    }
}
