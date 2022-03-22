package catalogofproduct;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CatalogOnList implements Catalog {
    public static CatalogOnList cat;
    List<String> catalog = null;
    DataBaseForCatalog db = null;

    private CatalogOnList() {
    }

    public static CatalogOnList getInstance() {
        if (cat == null) {
            cat = new CatalogOnList();
        }
        return cat;
    }

    @Override
    public void showCatalog() {
        //if (catalog==null)
        catalog = readFromBD();
        System.out.println("Инициализация каталога проведена");
        printCatalog(catalog);
    }

    @Override
    public void createCatalog() {
        if (catalog != null)
            System.out.println("Каталог будет перезаписан!");

        catalog = readFromBD();
        // if (catalog != null)
        printCatalog(this.catalog);

    }

    private List<String> readFromBD() {
        List<String> catalog = new ArrayList<>();
        db = DataBaseForCatalog.getInstance();
        try (BufferedReader br = new BufferedReader(new FileReader(db.readDataFromDB()))) {
            String currentLine = "";
            while ((currentLine = br.readLine()) != null) {
                catalog.add(currentLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return catalog;
    }

    private void printCatalog(List<String> catalog) {
        if (catalog != null)
            for (String s : catalog) {
                if (s == null) {
                    continue;
                }
                System.out.println(s);
            }
        else System.out.println("Каталог пуст");
        ;

    }


    @Override
    public void changeCatalog() {

    }

    @Override
    public void deleteCatalog() {

    }
}
