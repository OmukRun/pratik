package Musty.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _24_Scanner3 {

    public static void main(String[] args) {

     /*  kullanıcını sevdiği meyveyi print eden code create ediniz  */

        Scanner m = new Scanner(System.in);
        System.out.print("En sevdiğiniz meyve : ");
        String meyve=m.nextLine();
        System.out.println("meyve = " + meyve.toUpperCase());


    }
}
