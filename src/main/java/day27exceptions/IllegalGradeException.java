package day27exceptions;

// Eger Exception Class'a extend ederseniz sizin Class'iniz "Compile Time Exception" olur
public class IllegalGradeException extends Exception{   // extends Exception dedik, compile yaparken hata verir.

    public IllegalGradeException(String message){

        super(message);   // super yazinca Parent Class a extend oldugu icin onun cocugu olur ve oraya gider
                          // ve ondaki methodlari kullanabilir.

    }

}