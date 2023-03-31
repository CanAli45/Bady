package day_03_31_switchStatements;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        /*
            Soru 4-Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin ve
                   girilen harfin karsiligini yazdirin.
                   I : International S : Software T : Testing Q : Qualifications B: Board
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ISTQB harflerinden birini giriniz");
        char harf = scan.next().charAt(0);
        harf = Character.toLowerCase(harf);
        switch (harf) {
            case 'i':
                System.out.println("International ");
                break;
            case 's':
                System.out.println("Software");
                break;
            case 't':
                System.out.println("Testing");
                break;
            case 'q':
                System.out.println("Qualifications");
                break;
            case 'b':
                System.out.println("Board");
            default:
                System.out.println("Yanlis giris yaptiniz");

        }
    }
}
