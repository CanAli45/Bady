package day_03_30_Ternary;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        /*
            Soru 4-Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
                   50’den kucukse “Maalesef kaldin” yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu girin");
        int not = scan.nextInt();
        System.out.println(not >= 50 ? "Sinifi gectin" : "Malesf kaldin");

    }
}
