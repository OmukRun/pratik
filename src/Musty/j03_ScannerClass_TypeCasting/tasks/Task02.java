package Musty.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *
         */
        Scanner s = new Scanner(System.in);
        System.out.println("Boyunuz (cm)");
        int boy = s.nextInt();
        float mboy=(float)boy/100;
        System.out.println("Kilonuz (kg)");
        int kilo=s.nextInt();
        System.out.println("VKE = " +(int)(kilo/(mboy*mboy)));
        System.out.println("VKE = " +(float)kilo/(mboy*mboy));




    }
}
