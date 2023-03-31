package day_03_30_Ternary;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        /*
            Soru 6-Kullanicidan bir sayi alin ve mutlak degerini yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi girin");
        int sayi = scan.nextInt();
        System.out.println(sayi >= 0 ? sayi : sayi * -1);

    }
}
