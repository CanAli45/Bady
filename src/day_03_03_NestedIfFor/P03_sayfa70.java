package day_03_03_NestedIfFor;

import java.util.Scanner;

public class P03_sayfa70 {
    public static void main(String[] args) {
        /*
             Soru 5- Kullanicidan notunu alin
                     50 veya daha buyukse ”Sinifi Gectin”,
                     50’den kucukse “Maalesef kaldin” yazdirin.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        int not = scan.nextInt();
        if (not>=50&&not<=100){
            System.out.println("Sinifi gectin");
        }
        if (not<50&&not>=0){
            System.out.println("Malesef kaldin");
        }
    }
}
