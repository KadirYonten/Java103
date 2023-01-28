package day27exceptions;

public class IllegalNameException extends RuntimeException{
    // extends RunTimeException dedigimiz icin olusturdugumuz --> Costum Exception da RunTimeException olur.
    public IllegalNameException(String message){

        super(message);

    }
}
