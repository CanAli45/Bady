package day_03_03_NestedIfFor;

import java.util.Scanner;

public class P02_sayfa70 {
    public static void main(String[] args) {
        /*
            Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
                    ucgen eskenar ise “Eskenar ucgen” yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 kenar uzunlugu giriniz");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();
        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar1 > 0) {
            System.out.println("Girilen uzunluklar bir eskenar ucgen olusturur");
        } else {
            System.out.println("Kenar1 :" + kenar1 + ", Kenar2 :" + kenar2 + ", Kenar3 :" + kenar3);
        }
    }
}
