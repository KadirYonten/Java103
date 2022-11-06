
package day05ifstatement;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {

        //Example 1: Kullanici gün numarasini girsin, kodumuz  guün ismini yazsin
        //           2 ==> Pazartesi      5 ==> Persembe ...vs.

        Scanner input = new Scanner(System.in);
        System.out.println("Gün numarasini giriniz...");
        byte gunNo = input.nextByte();                      // byte tercih ettik cünki sadece bir rakam kullanacagiz, memoriden tasarruf saglar!

        if (gunNo == 1) {
            System.out.println("Pazar");        // Amerikan usulü takvimlerde haftanin ilk günü pazar kabul edilir.

        } else if (gunNo == 2) {
            System.out.println("Pazartesi");

        } else if (gunNo == 3) {
            System.out.println("Sali");

        } else if (gunNo == 4) {
            System.out.println("Carsamba");

        } else if (gunNo == 5) {
            System.out.println("Persembe");

        } else if (gunNo == 6) {
            System.out.println("Cuma");

        } else if (gunNo == 7) {
            System.out.println("Cumartesi");

        } else {
            System.out.println("Gecerli bir gun numarasi giriniz. Gecerli gun numaralari 1, 2, 3, 4, 5, 6, 7 den birisidir.");
        }


    }

}