package day_03_31_switchStatements;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        /*
            Soru 5-Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun numarasi giriniz");
        int gun = scan.nextInt();

        switch (gun) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta ici");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Yanlis giris yaptiniz");
        }

    }
}
