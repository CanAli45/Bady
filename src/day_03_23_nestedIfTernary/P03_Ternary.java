package day_03_23_nestedIfTernary;

import java.util.Scanner;

public class P03_Ternary {
    public static void main(String[] args) {

        /*
            Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
                    “Sayi 5’in tam kati” yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi isteyin");
        int sayi = scan.nextInt();
        System.out.println(sayi % 5 == 0 ? "Sayi 5’in tam kati" : "Sayi 5’in tam kati degildir");
    }
}
