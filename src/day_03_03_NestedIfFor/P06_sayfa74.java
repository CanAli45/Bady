package day_03_03_NestedIfFor;

import java.util.Scanner;

public class P06_sayfa74 {
    public static void main(String[] args) {
        /*
            Soru 5- Kullanicidan bir harf isteyin,
                    girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
                    yoksa girilen harfi yazdirin

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char krk = scan.next().charAt(0);
        if (krk>='a'&&krk<='z') {
            krk = Character.toUpperCase(krk);
            System.out.println("Girilen harf :"+krk);
        }else {
            System.out.println("Girilen harf :"+krk);
        }
    }
}
