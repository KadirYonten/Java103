package day25exceptions;

public class Exceptions02 {

    public static void main(String[] args) {

        String arr[] = {"Ali", "Can", "Veli", "Han"};

        getElementFromArray(arr,2);     //Veli
        getElementFromArray(arr,0);     //Ali
        getElementFromArray(arr,4);     //ArrayIndexOutOfBoundsException

    }

    //Bir String Array den index girerek eleman elde edebilmek icin bir method olusturun.

    public static void getElementFromArray(String arr[], int idx) {

        try{

            System.out.println(arr[idx]);

        }catch (ArrayIndexOutOfBoundsException e){
                               //Bu benim teknik olmayan aciklamam, kendimizde mesaj yazdirabiliriz..!
            System.out.println("Array index te bir problem meydana geldi====>"+e.getMessage());

            e.printStackTrace();  // ---> Exception ile ilgili detayli teknik mesaj verir.


            //Hata mesajini diger mesajlardan ayirmak icin kullaniriz.Konsolda exception´i (hata mesajini renkli) RENKLI yazdirir.
            System.err.println("Array index te bir problem yasandi");

        }

    }

}