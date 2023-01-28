package day26exceptions;

public class Exceptions02 {

    public static void main(String[] args) {

        char ch1 = getCharFromString("Java" , 2);
        System.out.println(ch1); //v

        char ch2 = getCharFromString("Selenium" , 8);
        System.out.println(ch2);    // StringIndexOutOfBoundsException
        // Eger bir String ten character/ler alinirken, olmayan bir index kullanilirsa StringIndexOfBoundsException alinir.

    }

    public static char getCharFromString (String str, int idx){
                                        // Metodumuz string ve int parametreli o yüzden parantez icine iki parametre yazdik
       char c = ' ';                    // Tek tirnak icinde bir bosluk var space character olmus oldu.. space --> character

        try {

           c = str.charAt(idx);

       }catch (StringIndexOutOfBoundsException e){

           System.out.println("Index ile ilgili bir problem olustu  -->  " + e.getMessage());
           // e Exception degiskeninin adidir e.getMessage(); metodu ile JAVA nin o hata icin olusturdugu mesajini aliriz.

           e.printStackTrace(); // Detayli "log" icin.. (Yigin izi yazdir metodu..)
            // log terminalde ki hatalarin adresini gösteren akis temesidir.
       }

       return c;
    }
}
