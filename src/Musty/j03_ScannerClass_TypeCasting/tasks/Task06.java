package Musty.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

        Scanner hip = new Scanner(System.in);
        System.out.println("A Kenar uzunluğu : ");
        int a = hip.nextInt();
        System.out.println("B Kenar uzunluğu : ");
        int b = hip.nextInt();
        double c = Math.sqrt(a*a + b*b);
        System.out.println("Hipotenüs : "+(int)c);



    }
}
