package Musty.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _25_Scanner4 {

    public static void main(String[] args) {

    /*   kullanıcının arabansındaki kapı sayısını print eden code create ediniz.  */

        Scanner car= new Scanner(System.in);
        System.out.print("Arabanızdaki Kapı Sayısı : ");
        byte a=car.nextByte();
        System.out.println("a = " + a);


    }
}


