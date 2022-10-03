package Musty.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _26_Scanner5 {

    public static void main(String[] args) {

    /*    kullanıcının  10 sene önceki yaşadığın şehri print eden code create ediniz.   */

        Scanner d1= new Scanner(System.in);
        System.out.println("10 yıl önce yaşadığınız şehir : ");
        String sehir= d1.nextLine();
        System.out.println("sehir = " + sehir.toUpperCase());

    }
}
