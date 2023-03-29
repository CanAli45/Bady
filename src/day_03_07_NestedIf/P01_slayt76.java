package day_03_07_NestedIf;

import java.util.Scanner;

public class P01_slayt76 {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
                kullaniciya musteri karti olup olmadigini sorun.
                Musteri karti varsa 10 urunden fazla alirsa %20,
                yoksa %15 indirim yapin,
                Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen urun adedinizi giriniz");
        int urunAdedi = scan.nextInt();
        System.out.println("Lutfen urun miktarini giriniz");
        int urunFiyati = scan.nextInt();
        System.out.println("Musteri kartiniz varsa 1'e, yoksa 2'ye basiniz ");
        int musteriKarti = scan.nextInt();
        double toplam = 0;
        if (musteriKarti != 1 && musteriKarti != 2) {
            System.out.println("Yanlis giris yaptiniz");
        }

        if (musteriKarti == 1) {
            if (urunAdedi >= 10) {
                toplam = urunAdedi * urunFiyati * 0.8;

            } else {
                toplam = urunAdedi * urunFiyati * 0.85;
            }
            System.out.println("Toplam tutar :" + toplam);
        } else if (musteriKarti == 2) {
            if (urunAdedi >= 10) {
                toplam = urunAdedi * urunFiyati * 0.85;
            } else {
                toplam = urunAdedi * urunFiyati * 0.9;
            }
            System.out.println("Toplam tutar :" + toplam);

        }


    }
}
