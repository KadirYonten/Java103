package day29abstractioncollections;

public class Runner {

    public static void main(String[] args) {
        System.out.println(Engine.price);  // Interface ismiyle direk ulastik.
        System.out.println(Ac.price);  // Interface ismiyle direk ulastik.
        System.out.println(Ac.weight);  // Interface ismiyle direk ulastik. Variable lar ismi ayni olsada karismaz
        System.out.println(Engine.weight);  // Interface ismiyle direk ulastik.
    }
}
