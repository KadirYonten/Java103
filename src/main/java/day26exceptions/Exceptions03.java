package day26exceptions;

public class Exceptions03 {

    public static void main(String[] args) {

        double d = divideStringByTheNumOfTheChar("123");

        System.out.println(d);

    }

    // Example 1: String'deki character sayisini bulunuz, String'i integer'a ceviriniz, Integer'i character sayisina bolunuz.
    public static double divideStringByTheNumOfTheChar(String str) {

        int length = 0;
        int i = 0;
        double sonuc = 0;

        try {

            length = str.length();  // NullPointerException: "null" String ile "length()" kullanildiginda alinir

            i = Integer.valueOf(str);   // NumberFormatException: Icinde rakamdan farkli character olan String ler valueOf() ile kullanildiginda

            sonuc = i / length;    // ArithmeticException: Bölen sayi sifir oldugunda alinir

        }catch (NullPointerException e){

            System.out.println("NullPointerException varsa -->  " + e.getMessage());

        }catch (NumberFormatException e){

            System.out.println("NumberFormatException varsa -->  " + e.getMessage());

        }catch (ArithmeticException e){

            System.out.println("ArithmeticException varsa -->  " + e.getMessage());
        }

        return sonuc;

    }


    // 2.Way Coklu catch ile yapilabildigi gibi kisa olarak Parent Class olan ExceptionClass kullanilabilir

    public static double divideStringByTheNumOfTheCharacter(String str) {

        int length = 0;
        int i = 0;
        double sonuc = 0;

        try {
            length = str.length();//NullPointerException: "null" String ile "length()" kullanildiginda alinir

            i = Integer.valueOf(str);//NumberFormatException: Icinde rakamdan farkli character olan String'ler valueOf() ile kullanildiginda

            sonuc = i / length;//ArithmeticException: Bolen sayi sifir oldugunda alinir

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
        return sonuc;
    }

        // 3.Way

        public static double divideStringByTheNumOfTheCharacters(String str){

            int length = 0;
            int i = 0;
            double sonuc = 0;

            try {

                length = str.length();  // NullPointerException: "null" String ile "length()" kullanildiginda alinir.

                i = Integer.valueOf(str);   // NumberFormatException: Icinde rakamdan farkli character olan String'ler valueOf() ile kullanildiginda

                sonuc = i / length;//ArithmeticException: Bolen sayi sifir oldugunda alinir

            }catch(NullPointerException e){

                System.out.println("NullPointer´a özel.." + e.getMessage());

            }catch (Exception e){

                System.out.println("Diger tüm Exception´lar icin...");
            }

            return sonuc;
    }

   /*

    Note: 1) Aralarında "parent-child" relationship olan Exception Class'ları multiple catch'lerde kullanmak isterseniz
             "child" olan önce kullanılmalıdır, aksi takdirde hata verir.

          2) Aralarında "parent-child" relationship olmayan Exception Class'ları multiple catch'lerde kullanmak isterseniz
             sıralamanın bir önemi yoktur.

   */

}
