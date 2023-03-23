package day_03_07_NestedIf;

import java.util.Scanner;

public class P02_slayt76 {
    public static void main(String[] args) {
        /*
            Soru 4- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi sorun,
                    istedigi birim metre veya santimetre ise cevirip yazdirin,
                    yoksa “istediginiz birim sisteme kayitli degil” yazdirin.

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kilometre (km) olarak bir mesafe giriniz");
        double girlenMesafe= scan.nextDouble();
        System.out.println("Cevirmek istediginz birimi metre ise 'm', santimetre ise 'cm' seklinde giriniz");
        String cins=scan.next();
        double toplam=0;

        if (!cins.equalsIgnoreCase("M")&&!cins.equalsIgnoreCase("CM")){
            System.out.println("istediginiz birim sisteme kayitli degil");
        }else {
            if (cins.equalsIgnoreCase("M")){
                toplam=girlenMesafe*1000;

            }else if (cins.equalsIgnoreCase("CM")){
                toplam=girlenMesafe*100000;

            }
            System.out.println("Sonuc :"+toplam);
        }

    }
}
