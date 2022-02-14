package aboutcollection;

import product.Kefir;
import product.Milk;
import product.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RunAppCollection {
    public static void main(String[] args) {
        //Collection<Product> anyCollection = CollectionGenerator.getAnyCollection();
        List<Product> anyCollection = new ArrayList<>();
        anyCollection.add(new Kefir());
        anyCollection.add(new Kefir());
        anyCollection.add(new Kefir());
        anyCollection.add(new Kefir());
        anyCollection.add(new Kefir());
        anyCollection.addAll(getOtherProduct());
        System.out.println(anyCollection.size());


    }
     static Collection <Product> getOtherProduct(){
        Collection <Product> basket= new ArrayList<>();
        basket.add(new Milk());
         basket.add(new Milk());
         basket.add(new Milk());
         basket.add(new Milk());
        return basket;
    }

}
