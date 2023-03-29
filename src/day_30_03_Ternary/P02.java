package day_30_03_Ternary;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        /*
            Soru 3-Kullanicidan bir harf isteyin,
                   girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
                   yoksa girilen harfi yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf girin");
        char girilenHarf = scan.next().charAt(0);
        // char output = Character.toUpperCase(girilenHarf);

        // System.out.println(girilenHarf >= 'a' && girilenHarf <= 'z' ? output : girilenHarf);
        System.out.println(girilenHarf >= 'a' && girilenHarf <= 'z' ? (char) (girilenHarf - 32) : girilenHarf);
    }
}
