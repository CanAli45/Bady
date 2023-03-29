package day_03_03_NestedIfFor;

public class P01 {
    public static void main(String[] args) {
        /*
             Soru 1- While loop kullanarak 2 basamakli 7 ile bolunebilen
                     pozitif tamsayilari yazdirin.
         */

        int sayi = 100;

        for (int i = sayi; i >= 1; i--) {

            if (i % 7 == 0) {

                System.out.print(i + " ");

            } else {

                i--;
            }
        }
    }
}

