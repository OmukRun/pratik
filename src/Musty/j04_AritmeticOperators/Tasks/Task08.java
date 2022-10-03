package Musty.j04_AritmeticOperators.Tasks;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("Saniye : ");
        int zaman = scan.nextInt();
        System.out.println("Sonuç : " + (zaman/3600)+" Saat "+((zaman%3600)/60)+" dakika "+(zaman%60)+" saniye");

    }
}
