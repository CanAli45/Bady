package day_03_23_nestedIfTernary;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        /*
            Soru 3- Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi oldugunu yazdirin,
                    sayi cift sayi ise 10’un tam kati olup olmadigini yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi % 2 != 0) {

            if (sayi < 0) {
                System.out.println("Girilen sayi : " + sayi + " negatif bir tek sayidir");
            } else {
                System.out.println("Girilen sayi : " + sayi + " pozitif bir tek sayidir");
            }

        } else if (sayi % 10 == 0) {
            System.out.println("Girilen sayi : " + sayi + " 10'un katidir");

        } else {
            System.out.println("Girilen sayi : " + sayi + " 10'un kati degildir");
        }

    }
}
