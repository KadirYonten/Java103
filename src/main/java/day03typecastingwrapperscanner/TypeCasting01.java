package day03typecastingwrapperscanner;

public class TypeCasting01 {

    //Type Casting: Bir numeric data type'ini --->  diger numeric data type'ina cevirmek demektir.
    //              byte < short < int < long < float < double                  en kücük byte --->  enbüyük ise double

    //Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir.
    //Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir.

    public static void main(String[] args) {

        byte age = 23;
        int newAge = age;

        long population = 1234;
        int newPopulation = (int) population;

        //Example 1: short'u double'a ceviren kodu yaziniz

        short numOfStudents = 235;
        double newNumOfStudents = numOfStudents;    //Auto Widening (OTOMATIK GENISLETME oldu..) (short < double)  kücük kutu -->  büyük kutuya koyuldu...

        // Example 2: float'i byte yapan kodu yaziniz.

        float price = 12.99F;
        byte newPrice = (byte) price;       //Explicit Narrowing   (ACIK DARALTMA oldu..) (float > byte)  büyük kutu --> kücük kutuya zorlayarak koyuldu...

        System.out.println(newPrice);   //12 ==> Java ondalik sayiyi, tam sayiya cevirirken yuvarlama islemi yapmaz.
                                        //       Java ondalik sayiyi, tam sayiya cevirirken ondalik kismini siler,atar.

        int number = 515;
        byte newNumber = (byte) number;
        System.out.println(newNumber);//3 ==> Java 515'i 256(byte daki sayilarin sayisi)'ya boldu kalani return etti.

        int num = 510;
        byte newNum = (byte) num;               // int olan num degerini byte olan newNum degisken degerine atama yaptik.. Type Casting oldu.
        System.out.println(newNum);// -2
    }
}