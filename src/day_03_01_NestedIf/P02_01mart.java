package day_03_01_NestedIf;

import java.util.Scanner;

public class P02_01mart {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
                NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
                Kullanici o veya O yazdiginda output Ocak olsun.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);
        harf=Character.toUpperCase(harf);
        if (harf=='A'){
            System.out.println("Agustos, Aralik");
        }
        if (harf=='E'){
            System.out.println("Eylul, Ekim");
        }
        if (harf=='H'){
            System.out.println("Haziran");
        }
        if (harf=='S'){
            System.out.println("Subat");
        }
        if (harf=='O') {
            System.out.println("Ocak");
        }
        if (harf=='M') {
            System.out.println("Mart, Mayis");
        }

        if (harf=='N') {
            System.out.println("Nisan");
        }

        if (harf=='K') {
            System.out.println("Kasim");
        }
        if (harf=='T') {
            System.out.println("Temmuz");
        }
    }
}
