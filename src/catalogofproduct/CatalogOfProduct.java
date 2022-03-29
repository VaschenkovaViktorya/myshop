package catalogofproduct;

import javax.xml.namespace.QName;

public class CatalogOfProduct {
    private String name;

    public String[] getCatalog() {
        return catalog;
    }
   // private String[] catalog=null;
    private  String[] catalog={
            "Продукты",
            "Хозтовары",
            "Одежда",
            "Бытовая химия",
            "Дача, сад",
            "Автотовары"
    };
    public  void openCatalog(){
        for (String s:catalog
             ) {
            System.out.println(s);

        }
        System.out.println("*******************************************************************************");

    }
    public static void showCatalog() throws CatalogOfProductInvalidException {

        CatalogOfProduct cat = new CatalogOfProduct();
        if (cat.getCatalog() == null) throw new CatalogOfProductInvalidException("**************Каталог товаров пуст**************");
        else {
            for (String s : cat.getCatalog()) {
                System.out.println(s);
            }
        }

        ;
    }
}
