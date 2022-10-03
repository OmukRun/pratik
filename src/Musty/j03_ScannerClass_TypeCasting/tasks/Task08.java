package Musty.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */


        Scanner no= new Scanner(System.in);
        System.out.println("1. Vize : ");
        int v1= no.nextInt();
        System.out.println("2. Vize : ");
        int v2=no.nextInt();
        System.out.println("Final Notu : ");
        int f=no.nextInt();
        System.out.println("Notunuz : " + ((((v1+v2)/2)*0.3)+(f*0.7)));


    }
}
