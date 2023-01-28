package day29abstractioncollections;

public interface Engine extends Vehicle{
    /*
     Child        Parent
     Class ---> Interface ==> implements
     Class ---> Class     ==> extends
     Interface ---> Interface ==> extends
     Interface ---> Class ==> Mumkun degildir.

     Interface´lerdeki tüm variable´lar default olarak "public" dir.
     Interface´lerdeki tüm variable´lar default olarak "final" dir.Degeri degistirilemez.
     Interface´lerdeki tüm variable´lar default olarak "static" tir.Interface ismiyle ulasilabilir.

     */
    int price = 2000;
    double weight = 23.5;
    void run();

}
