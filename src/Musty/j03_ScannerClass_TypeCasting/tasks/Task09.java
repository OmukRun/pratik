package Musty.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("A sayısı : ");
        int a = sc.nextInt();
        System.out.println("B sayısı : ");
        int b = sc.nextInt();
        System.out.println("C sayısı : ");
        int c = sc.nextInt();
        System.out.println("İşlem Sonucu : "+(double)((a*a)-(b*b))/(c*3));

    }
}
