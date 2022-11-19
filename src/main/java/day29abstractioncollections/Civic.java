package day29abstractioncollections;
/*
    "abstract method"lar sadece NE yapılacağını(WHAT TO DO) söyler
    "concrete method"lar ne yapılacağı ile birlikte NASIL yapılacağını(HOW TO DO) da söyler

    "interface"ler bir yapılacak işler listesidir.(TO DO LIST)

    "multiple parent interface" kullandığınızda aynı method ismi ile birden fazla method oluşturursanız bu method'ların
    return type'ları aynı olmalıdır. Aksi takdirde hata verir.

    "interface" lerde constructor olmadığı için interface'lerden object oluşturulamaz.
    "abstract class" lar class oldukları için constructor vardır. Ama constructor'lar abstract class'larda object oluşturamazlar.

    Soru: "Abstract Class" ile "Interface" in farklari nelerdir?
       1)Method
            "Abstract Class" hem abstract hem de concrete method lar icerebilir.
            "Interface" ler ise sadece abstract method'lar icerir.
            Ama istersek interface'ler icinde de "default" ve "static" keyword'ler kullanarak concrete method lar olusturabiliriz.

       2)Variable
            "Abstract Class" larda normal Class'lardaki gibi her turlu variable olusturulabilir.
            "Interface" lerde ise variable'lar public static ve final olmak zorundadir.

       3)Inheritance
            "Abstract Class" lar class olduklari icin multiple inheritance'a musaade etmezle.
            "Interface" ler ise multiple inheritance'i desteklerler.

       4)Object Creation
            "Abstract Class" larda constructor vardir ama object olusturmada kullanilmazlar.
            "Interface" lerde ise constructor olmadigindan object olusturulamaz.

 Soru: Object Oriented Programming Language prensipleri(principles) nelerdir?
       i)Inheritance   ii)Polymorphism   iii)Encapsulation   iv)Abstraction


 */

public class Civic implements Engine,Ac {
    @Override
    public void run() {
        System.out.println("Civic runs well");
    }


}
