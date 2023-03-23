package day_03_03_NestedIfFor;

import java.util.Scanner;

public class P05_sayfa74 {
    public static void main(String[] args) {
        /*
            Soru 4- Kullanicidan bir karakter girmesini isteyin,
                    girilen karakterin buyuk harf olup olmadigini yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char krk = scan.next().charAt(0);

        if (krk >= 'A' && krk <= 'Z') {
            System.out.println("Girilen karakter :" + krk);
        } else {
            System.out.println("Girilen karakter :" + krk + " harfidir");
        }
    }
}
