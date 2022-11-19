package day32maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    public static void main(String[] args) {
        List<String>myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //for each loop kullanarak her elemanin souna "!" ekleyiniz...
        // NOTE: loop´lar kendi baslarina "Collection"lari update edemezler, bu yuzden Java "iterator" lari olusturmustur.
        //Iteratorlar Collection lari update etmek icin kullanilir.

        for (String w: myList){
            w = w + "!";
        }
        System.out.println(myList);

        ListIterator<String> itr = myList.listIterator();

        while (itr.hasNext()){  //hasNext(); --> senden sonra elemen var mi?

            String el = itr.next();  // next(); --> üstünden atladigi elemanii bize verir ve pointeri bur ileri iter..

            itr.set(el+"!");
        }
        System.out.println("myList = " + myList);
    }
}