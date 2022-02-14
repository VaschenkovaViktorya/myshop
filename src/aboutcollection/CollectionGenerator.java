package aboutcollection;

import product.Product;

import java.util.ArrayList;

public class CollectionGenerator {
    public static java.util.Collection<Product> getAnyCollection(){
        System.out.println("ArrayList");
        return new ArrayList<Product>();

    }
}
