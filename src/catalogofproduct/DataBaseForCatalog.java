package catalogofproduct;

import java.io.File;

public class DataBaseForCatalog {
    private File file;

    private static DataBaseForCatalog db;

    private DataBaseForCatalog() {

        //file = new File("1.txt");
    }

    public static DataBaseForCatalog getInstance() {
        if (db == null) {
            db = new DataBaseForCatalog();
        }
        return db;
    }


    public String readDataFromDB() {
       String filename  ="testfile/catalog.txt";
        return filename;
    }
}





