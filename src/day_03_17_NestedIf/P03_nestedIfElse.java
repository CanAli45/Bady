package day_03_17_NestedIf;

import java.util.Scanner;

public class P03_nestedIfElse {
    public static void main(String[] args) {

        /*
        Soru 2- Kullanicidan aldigi urun adedi ve  liste fiyatini alin,
                kullaniciya musteri karti olup olmadigini sorun.
                Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
                Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
         */

        Scanner scan = new Scanner(System.in);
        double toplam = 0;
        System.out.println("Lutfen urun adedini giriniz");
        int urunAdedi = scan.nextInt();
        System.out.println("Lutfen liste fiyatini giriniz");
        int listeFiyati = scan.nextInt();
        System.out.println("Musteri kartiniz varsa 1'e basiniz");
        int musteriKarti = scan.nextInt();

        if (musteriKarti == 1) {
            if (urunAdedi >= 10) {
                toplam = urunAdedi * listeFiyati * 0.8;
            } else  {
                toplam = urunAdedi * listeFiyati * 0.85;
            }

        } else {
            if (urunAdedi >= 10) {
                toplam = urunAdedi * listeFiyati * 0.85;
            } else  {
                toplam = urunAdedi * listeFiyati * 0.9;
            }

        }

        System.out.println("Toplam tutar :" + toplam);
    }
}
