package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps01 {
    public static void main(String[] args) {
        // Size verilen bir cümledeki her kelimenin kac kere kullanildigini gösteren kodu yaziniz
        // "I like to move it, mave it." --> I=1, like=1, to=1, move=", it=2

        String str = "I like to move it, move it.";

        str = str.replaceAll("\\p{Punct}","");
        System.out.println(str);

        String[] kelimeler = str.split(" ");
        System.out.println("Kelimeler = " + Arrays.toString(kelimeler));

        HashMap<String,Integer>gorunum = new HashMap<>();

        for (String w:kelimeler) {

            Integer gorunumSayisi = gorunum.get(w);

            if (gorunumSayisi == null){
                gorunum.put(w,1);
            }else {
                gorunum.put(w,gorunumSayisi+1);
            }
        }
    }
}
