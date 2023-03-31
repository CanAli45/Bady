package day_03_31_switchStatements;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        /*
            Soru 2-Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 2 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();
        int birlerBasamagi = sayi % 10;
        int onlarBasamagi = sayi / 10;
        if (sayi < 100 && sayi > 9) {
            switch (onlarBasamagi) {
                case 1:
                    System.out.print("On");
                    break;
                case 2:
                    System.out.print("Yirmi");
                    break;
                case 3:
                    System.out.print("Otuz");
                    break;
                case 4:
                    System.out.print("Kirk");
                    break;
                case 5:
                    System.out.print("Elli");
                    break;
                case 6:
                    System.out.print("Altmis");
                    break;
                case 7:
                    System.out.print("Yetmis");
                    break;
                case 8:
                    System.out.print("Seksen");
                    break;
                case 9:
                    System.out.print("Doksan");
                    break;
            }
            switch (birlerBasamagi) {
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("uc");
                    break;
                case 4:
                    System.out.println("dort");
                    break;
                case 5:
                    System.out.println("bes");
                    break;
                case 6:
                    System.out.println("altı");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;
            }

        } else {
            System.out.println("Yanlis giris yaptiniz");
        }
    }
}
