package day08stringmanipulations;

import java.util.Scanner;

public class StringManupulations01 {
    public static void main(String[] args) {

        //Example 1: Kullanicidan aldiginiz isimin ilk ve son harfini yazdiriniz.. Ramazan--> Rn

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim = input.next();

       // 1.Yol:

        char ilkHarf = isim.charAt(0);   // charAt(); methodu parantez icine verilen index degerindeki karakteri verir!

        char sonHarf = isim.charAt(isim.length()-1);        // son karakteri alirken kelimenin uzunlugu -1 deriz. lenght (); metodu Stringin uzunlugunu verir.

        System.out.println(""+ilkHarf +sonHarf);    // Char ifadeyle bosluk toplamasi yapmak string deger verir!  " " + char ' ' = string verir! --> Concat();
                                                    // Bosluk olmasaydi char degerlerinin ascii degerlerini verirdi.. ASCII --> her karakterin sayisal degeri..

        //Yazdiginiz kod her durum icin calisiyorsa DYNAMIC kod, yoksa hep bir sarta özel calisiyorsa HARD kod olur ama bu istenmez!!!

        //2. Yol:

        String ilk = isim.substring(0,1);   // Parantez icindeki ilk rakam dahil, ikinci dahildegildir!!  Yani isim ín 0.index teki karakteri almaliyiz.
        String son = isim.substring(isim.length()-1);

        System.out.println("Ikinci yol = " + ilk + son );


        // Example 2: Verilen string deki sadece hayvan isimlerini ekrana yazdiriniz.
        // "Ben kedi, esim tavuk, oglum sever inek"

        String str = "Ben kedi, esim tavuk, oglum sever inek";

        /* substring() iki kullanimi vardir.

        1) substring (baslangic indeksi, bitis indeksi) Stringin bir parcasini almaya yarar.
        2) substring (baslangis indeksinden sonuna kadar) almaya yarar.

         */

        String kedi = str.substring(4,8);
        String tavuk = str.substring(15,20);
        String inek = str.substring(34);

        System.out.println(kedi +tavuk + inek);

       // Example 3: Ilk isim ve soy isimin ilk harflerini yazdiran kodu yaziniz Ali Can -->AC

        System.out.println("Lütfen Ad ve Soyadinizi yaziniz");
        String tamIsim = input.nextLine();

        String ailk = tamIsim.substring(0,1);
        String silk = tamIsim.split(" ")[1].substring(0,1);      // split(); bölmek demektir, böldügü yeri iki parcaya ayirir,
                                           // [1] indextir, ikinci parcada islem yapmak icin 1 yazariz ..

        System.out.println(ailk+silk);


    }

    }