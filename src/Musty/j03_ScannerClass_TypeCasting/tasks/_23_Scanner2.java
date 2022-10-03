package Musty.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _23_Scanner2 {

    public static void main(String[] args) {

    /*   kullanıcının yasını print eden code create ediniz  */

        Scanner s = new Scanner(System.in);
        System.out.print("Yaşınız : ");
        byte yas=s.nextByte();
        System.out.println("yas = " + yas);


    }
}
