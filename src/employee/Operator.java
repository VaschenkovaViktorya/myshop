package employee;

import catalogofproduct.Catalog;
import catalogofproduct.CatalogOnList;

import java.io.FileWriter;

public class Operator {
    private String name;
    private String position;
    private Catalog catalog;

    public Operator(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void openCatalog() {
        catalog = CatalogOnList.getInstance();
        catalog.showCatalog();
    }

    public void createCatalog() {

    }

    public void addPositionToCatalog(String newPosition) {
        try (FileWriter fw = new FileWriter("testfile/test.txt", true)) {
            fw.write(newPosition+"\n");
            //System.out.println();
            fw.flush();
           System.out.println("запись прошла");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteCatalog() {

    }
}
