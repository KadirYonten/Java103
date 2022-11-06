package day09stringmanipulations;

import java.util.Scanner;
public class StringManipulations01 {

    public static void main(String[] args) {

        String str = "Kara kara dusunme Ankara";

        //indexOf() method'u verilen character veya caharacter'lerin "ilk gorunumunun" index'ini verir.                 indexOf();

        int idxA1 = str.indexOf("kara");        //Bir hece ariyorsak o hecenin ilk basladigi yerin indexini verir.
        System.out.println(idxA1);

        //lastIndexOf() method'u verilen character veya caharacter'lerin "son gorunumunun" index'ini verir.             lastIndexOf();

        int idxA2 = str.lastIndexOf("kara");
        System.out.println(idxA2);

        String s = "Mississippi";
        int idxI = s.indexOf('i');          //indexOf() hem String hem de char ile kullanilabilir!!!
        System.out.println(idxI);

        int idxIss1 = s.indexOf("iss");     //Ilk göründügü "ilk" caharacter'inin indexini verir
        System.out.println(idxIss1);
        int idxIss2 = s.lastIndexOf("iss");         //Son gorunumun "ilk" caharacter'inin indexini verir!!!
        System.out.println(idxIss2);

        //Example 1: Bir String'deki bir character'in tekrarli veya tekrarszi olup olmadigini gosteren kodu yaziniz
        //           "Helloooo" ==> H-->Tekrarsiz     e-->Tekrarsiz     l-->Tekrarli     o-->Tekrarli

        String t = "Helloooo";
        char c = 'e';

        if(t.indexOf(c)==t.lastIndexOf(c)){
            System.out.println("Tekrarsiz");
        }else{
            System.out.println("Tekrarli");
        }

        String u = "Learn Java earn money";

        //indexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayi kadar character'i gectikten sonra!!!
        // istenen character'in  ilk gorunumunun indexini return eder.

        int sonuc = u.indexOf("e", 7);      // ilk 8 karakterden(7. index) sonraki ilk "e" nerdedir?      indexOf();
        System.out.println(sonuc);          //11

        //lastIndexOf() iki parametre ile kullanilirsa, ikinci parametredeki sayiyi index olarak kabul edip en bastan
        // bu indexe kadar olan karakterleri bir kutu icine aliniz ve lastIndexOf() method'unu sadece bu kutu icindeki String icin kullanir.

        String m = "Hello everyone!";
        int e = m.lastIndexOf("e", 10);     // 10.indexe kadar ki (11 eleman icinde) SONDAN ilk "e" kacinci indextedir?   lastIndexOf();
        System.out.println(e);      //8


        String v = "";

        //isEmpty() method'u bir String'in bos olup olmadigini kontrol eder.

        //Eger String'de hic character yoksa isEmpty() "true" return eder, her hangi bir character varsa "false" return eder.

        // length()==0 demek isEmpty() true verir demektir.   length(); --> int deger döner oda indextir!

        //Bir String'in bos olup olmadigini anlamak icin "length()==0" kullanmayin, stringler icin "isEmpty()" kullanin.

        boolean bosMu = v.isEmpty();
        System.out.println(bosMu);

        String x = " ";

        //isBlank(); hem "bos String" icin hem de "sadece space" iceren String'ler icin true return eder.  Bosluk mu var? veya Bos mu? anlami vardir.

        boolean blankMi = x.isBlank();
        System.out.println(blankMi);        //true

        //Example 2: Kullanicidan alinan isim mutlaka space'den farkli en az 1 character icermelidir.

        Scanner input = new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz...");
        String ilk = input.nextLine();

        if(ilk.isBlank()){
            System.out.println("Sana ismini gir dedim...");
        }else{
            System.out.println(ilk);
        }
    }
}

















