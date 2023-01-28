package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {
    public static void main(String[] args) {

        // Example 1: [0, 2, 3, 0, 12, 0] put the zeros to the end
        //            [2, 3, 12, 0,  0,  0]

        int[] original = {0, 12, -3, 0};
        int[] yeni = new int[original.length];

        int idx = 0;

        for (int i = 0; i < original.length; i++) {
            if (original[i] != 0) {
                yeni[idx] = original[i];
                idx++;
            }
        }

        System.out.println(Arrays.toString(yeni));


        //Example 2: Bir Array'in icinde herhangi bir elemanin olup olmadigini kontrol eden ve
        // kac kere tekrarlandigini gosteren kodu yaziniz

        int[] arr = {2, 1, -3, 2};

        int eleman =2;

        int counter = 0;  //flag :bazi durumlarin olup olmadigini kontrol etmek icin flag kullanilir

        for (int w : arr) {

            if (w == eleman) {
                counter++;
            }
        }

        if (counter > 0) {
            System.out.println(eleman + " array´de " + counter + " defa var");
        } else {
            System.out.println(eleman + " array´de yok");
        }


        // Example 3- Size verilen bir cümledeki en uzun kelimeyi bulan kodu yaziniz
        // "Java kolaydir calisana, ne kolay ki calismayana"

        String sentence = "Java kolaydir calisana, ne kolay ki calismayana.";
        System.out.println("o " + sentence);

        sentence = sentence.replaceAll("\\p{Punct}","");
        System.out.println("y " + sentence);

        String words[] = sentence.split(" ");

        Arrays.sort(words, Comparator.comparingInt(String::length));  // uzunluklarina göre siralama...

        System.out.println(Arrays.toString(words));

        System.out.println(words[words.length-1]);


    }


}

