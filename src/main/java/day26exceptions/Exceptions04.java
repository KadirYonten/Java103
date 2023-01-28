package day26exceptions;

    /*
        Exception'lar ikiye ayrılır:

    1) RunTime(Unchecked) Exception: Siz run butonuna bastıktan sonra oluşan Exception 'lardır.

    a)ArithmeticException

    b)NullPointerException

    c)ArrayIndexOutOfBoundsException

    d)StringIndexOutOfBoundsException

    e)NumberFormatException

    2) CompileTime(Checked) Exception: Biz kod yazarken javanın kızmızı olarak altını çizdigi durumlardaki Exception´lardir.

 */

public class Exceptions04 {

    public static void main(String[] args) {

        int age = 250;

        try {

            printAge(age);

        }catch (IllegalArgumentException e){

            System.out.println(e.getMessage());
        }

    }

    // Example: Yas´i ekrana yazdiran bir method olusturunuz.

    int age = 0;

    public static void printAge (int age){

        if (age<0 || age>200 ){

            throw new IllegalArgumentException("Yas 200´den büyük yada negatif olamaz !");

            // IllegalArgumentException --> Yasa disi argüman Istisnasi--> Gecersiz argüman hatasi..

            // Throw new Exception --> HATA firlat demekle kod´a trafik isigi koyariz..Kodu istisna bir durumda durdururuz!

            // Exception throw edilince kod calismaz, durdurulur!! yoksa hata olsada calismaya devam ederdi..
            // Herhangi bir satirda "Exception" atilirsa Java direkt "catch" bolumune gecer, try icindeki ve sonraki kodlari calistirmaz!
        }

        System.out.println(age);

    }
}
