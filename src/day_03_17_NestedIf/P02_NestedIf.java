package day_03_17_NestedIf;

import java.util.Scanner;

public class P02_NestedIf {
    public static void main(String[] args) {

        /*
                Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
                        Erkek 65 yas ve uzeri emekli olabilir.
                        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya
                        “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi Kadin icin 'K' veya 'k', " +
                            "\nErkerk icin 'E' veeya 'e' seklinde giriniz");
        char cinsiyet = scan.next().toLowerCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (cinsiyet == 'k') {
            if (yas < 60) {
                System.out.println("Emekli olabilmek icin " + (60 - yas) + " yil daha calısmalisiniz");
            } else {
                System.out.println("Emekli olabilirsiniz");
            }
        } else if (cinsiyet == 'e') {

            if (yas < 65) {
                System.out.println("Emekli olabilmek icin " + (65 - yas) + " yil daha calısmalisiniz");
            } else {
                System.out.println("Emekli olabilirsiniz");
            }
        } else {
            System.out.println("Yanlis giris");
        }

    }
}
