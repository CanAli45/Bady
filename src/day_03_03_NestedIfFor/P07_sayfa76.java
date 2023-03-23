package day_03_03_NestedIfFor;

import java.util.Scanner;

public class P07_sayfa76 {
    public static void main(String[] args) {
        /*
            Soru 1- Kullanicidan cinsiyetini ve yasini alin,
                    Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
                    Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya
                    “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi (Erkek icin :'e', kadin icin 'k' seklinde) ve yasinizi giriniz");


        char cinsiyet=scan.next().charAt(0);

        cinsiyet=Character.toUpperCase(cinsiyet);
        int yas=scan.nextInt();

        if (cinsiyet=='K'){
            if (yas>=60){
            System.out.println("Emekli olabilirsiniz");
        }else {
                System.out.println("Emekli olabilmek icin "+(60-yas)+" yil daha calismalisiniz");
            }
        }else {
            if (yas>=65){
                System.out.println("Emekli olabilirsiniz");
            }else {
                System.out.println("Emekli olabilmek icin "+(65-yas)+" yil daha calismalisiniz");
            }
        }

    }
}
