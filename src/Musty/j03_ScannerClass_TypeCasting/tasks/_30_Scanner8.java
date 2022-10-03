package Musty.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _30_Scanner8 {

    public static void main(String[] args) {

    /*    Bir byte oluşturunuz.
          Konsola kg cinsinden bir ağırlık yazınız.
          Byte'ı yazdırınız.   */


        byte a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ağırlığı giriniz (kg):");
        a=scan.nextByte();
        System.out.println("Ağırlık = " + a);


    }
}
