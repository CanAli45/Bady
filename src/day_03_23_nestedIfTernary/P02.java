package day_03_23_nestedIfTernary;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        /*
             Soru 4- Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
                    “Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
                     gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini girin");
        String isim = scan.nextLine();
        isim = isim.toUpperCase();

        if (isim.equals("PAZARTESİ")) {
            System.out.println("Simdi calisma zamani tatile 5 gun var");

        } else if (isim.equals("SALI")) {
            System.out.println("Simdi calisma zamani tatile 4 gun var");

        } else if (isim.equals("CARSAMBA")) {
            System.out.println("Simdi calisma zamani tatile 3 gun var");

        } else if (isim.equals("PERSEMBE")) {
            System.out.println("Simdi calisma zamani tatile 2 gun var");

        } else if (isim.equals("CUMA")) {
            System.out.println("Simdi calisma zamani tatile 1 gun var");

        } else if (isim.equals("CUMARTESİ")) {
            System.out.println("Simdi dinlenme zamani");

        } else if (isim.equals("PAZAR")) {
            System.out.println("Simdi dinlenme zamani");

        } else {
            System.out.println("Yanlis giris yaptiniz");
        }
    }
}
