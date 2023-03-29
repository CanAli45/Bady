package day_03_17_NestedIf;

import java.util.Scanner;

public class P01_ArtikYil {
    public static void main(String[] args) {

        /*
               Soru -  Kullanicidan artik yil olup olmadigini kontrol
                       etmek icin yil girmesini isteyin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kontrol eldilmesini istediginiz yil giriniz");
        int yil = scan.nextInt();

        if (yil % 4 != 0) {
            System.out.println("Girilen yil artik yil degildir");
        } else if (yil % 100 != 0) {
            System.out.println("Girilen yil artik yildir");
        } else if (yil % 400 == 0) {
            System.out.println("Girilen yil artik yildir");
        }else {
            System.out.println("Girilen yil artik yil degildir");
        }
    }
}
