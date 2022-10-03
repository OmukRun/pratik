package Musty.j04_AritmeticOperators.Tasks;

import java.util.Scanner;

public class Task05 {

    /*
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("Saat : ");
        int saat = scan.nextInt();
        System.out.print("Dakika : ");
        int dakika = scan.nextInt();
        System.out.print("Saniye : ");
        int saniye = scan.nextInt();
        System.out.println("Sonuç : "+((saat*3600) + (dakika*60) + saniye) + " saniyedir. " );



    }

}
