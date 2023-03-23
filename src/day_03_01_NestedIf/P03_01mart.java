package day_03_01_NestedIf;

import java.util.Scanner;

public class P03_01mart {
    public static void main(String[] args) {

        /*
             Soru 3- Kullanicidan bir sayi alin, sayi
                     3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
                     5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();


        if (sayi%3==0){
            System.out.println("Uc ile bolunebilen sayi");

        }
        if (sayi%5==0){
            System.out.println("Bes ile bolunebilen sayi");
        }




    }
}
