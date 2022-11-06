package day26exceptions;

public class Exceptions01 {

    public static void main(String[] args) {

        String str = "123";

        int result = convertStringToInteger(str);
        System.out.println(result + 5 );            //concat  yada toplama yapisina göre  metodun islevini kontrol edebiliriz yani sonuc int ise toplama yapar
                                                    // icerden gelen result variable eger string olsaydi concat olurdu ve 1235 yazardi..Test etmis olduk.

        String st = "1a2b";
        int r = convertStringToInteger(st);         //NumberFormatException --> Sayi formattinda beklenmeyen durum var demektir.
        // Eger icinde rakamdan farkli character barindiran bir String'i valueOf() kullanark Integer'a cevirmek isterseniz NumberFormatException aliriz.

        System.out.println(r+10);


    }


   /* public static int convertStringToInteger(String str){    // Bu Method´u altta Edit ettik

        return Integer.valueOf(str);                        // parseInt(); de kullanilabilirdi.. ikisi arasindaki tek fark biri Wrapper yapar
        ++ Verilen String rakamlardan olusuyorsa bu method sorunsuz calisir.. "123" ---> Cift tirnak icinde oldugu icin String bir degerdir!!!
    }
    */

    public static int convertStringToInteger(String str){

        int i = 0;      // Verilen String hem harf hemde rakam icerdigi icin, NumberFormatException verir.

        try{            // convertStringToInteger(String str) --> method u String parametre ister cünki parametre olarak parantez icine String koyduk!

            i = Integer.valueOf(str);

            System.out.println("Burasi Try bölümü..Happy End");

        }catch (NumberFormatException e){

            System.out.println("Rakam olmayan karakter iceren String´ler Integer´a cevirilemez");
        }

        return i;

    }

}
