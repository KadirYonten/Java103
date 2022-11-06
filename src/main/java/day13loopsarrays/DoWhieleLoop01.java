package day13loopsarrays;

import java.util.Scanner;

public class DoWhieleLoop01 {
    public static void main(String[] args) {

        // Example 1: Kullanicidan bir sayi aliniz sayi 100 den kücük ise ekrana kazandiniz yazdiriniz
        // Aksi halde ekrana "kaybettiin "yazdiriniz. Kullanici kazanirsa devem eder.

        Scanner input = new Scanner(System.in);
        int sayi = 0;
        do {
            System.out.println("Bir sayi giriniz");
            sayi = input.nextInt();
        }while (sayi<100);

        System.out.println(" Kaybettiniz ! ");

        // Example 2: Kullanicidan ismini aliniz ilk harfinin

        do {
            System.out.println("Lütfrn isminizi girinz..");
            char ilkharf = input.next().charAt(0);

            if(ilkharf >= 'A' && ilkharf <= 'Z'){
                System.out.println("Ismi basariyla girdiniz");
            }else{
                System.out.println("ismi yanlis girdiginiz icin isleminiz iptal edildi..");
                break;
            }

        }while (true);  // Burda while icine true yazinca sonsuz döngü olusur..!!bunu icerde break; yazarak kirdik...

        // Infinite Loop : Sonsuz döngü

        //Artirma azaltma kisminda hata yaparsaniz "infinite loop sorunsal" i olusur.
        for (int i = 1; i<4 ;  i++){
            System.out.println("Hi");
        }


                //Infinite Loop: Sonsuz dongu

                //Artirma azaltma kisminda hata yaparsaniz "infinite loop sorunsal" i olusur.
        for(int i=1; i<4; i++){
            System.out.println("Hi!");
        }
                //Artirma azaltma kismini yazmazsaniz "infinite loop sorunsal" i olusur.
        for(int i=1; i<4; ){
            System.out.println("Hi!");
        }

                //Artirma azaltma kismini yazmazsaniz "infinite loop sorunsal" i olusur.
        int i = 12;
        while(i<15){
            System.out.println("Hi!");
        }

    }
}


