package day_03_03_NestedIfFor;

import java.util.Scanner;

public class P08_sayfa76 {
    public static void main(String[] args) {
        /*
            Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
                    (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse obez,
                    25-30 arasi ise kilolu,
                    20-25 arasi ise normal,
                    20’den kucukse zayif yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu giriniz");
        int kilo = scan.nextInt();
        System.out.println("Lutfen boyunuzu giriniz");
        int boy = scan.nextInt();
        int kitleEndeksi = (kilo * 10000 / (boy * boy));
        if (kitleEndeksi > 30) {
            System.out.println("Vucud kitle endeksiniz :" + kitleEndeksi+" Obez ");
        } else if (kitleEndeksi >= 25) {
            System.out.println("Vucud kitle endeksiniz :" + kitleEndeksi+" Kilolu ");
        } else if (kitleEndeksi >= 20) {
            System.out.println("Vucud kitle endeksiniz :" + kitleEndeksi+" Normal ");

        } else {
            System.out.println("Vucud kitle endeksiniz :" + kitleEndeksi+" Zayif ");
        }
    }
}
