package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {

    //Scanner kullanicidan data almaya yarar, Scanner kullanici ile etkilesim kurmamizi saglar.
    //Scanner bir Java Class'idir, bu Class'i kullanabilmek icin "import" etmek gerekir --->  import java.util.Scanner;
    //Scanner Class'i Java nin util kutuphanesindedir.

    public static void main(String[] args) {

        //Kullanicidan data almak icin yapilmasi gerekenler

        //1.Adim: Scanner Class'indan yeni bir object olustururuz.

        Scanner input = new Scanner(System.in);

        //2.Adim:Kullaniciya ne yapacagini soyler ona göre bilgi girmesini saglariz.

        System.out.println("Hey kullanici yasini gir...");

        //3.Adim: Kullanicidan aldiginiz data'yi bir variable'in icine koyariz.

        byte age = input.nextByte();
        System.out.println("Hey kullanici senin yasin " + age);

    }

}