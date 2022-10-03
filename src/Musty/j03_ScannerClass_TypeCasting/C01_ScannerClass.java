package Musty.j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {
        //kullanıcıdan veri almak için şu adımlar takip edilir.
        //1. Adım Scanner class'dan obj create edilir.


     // Scanner scan = new Scanner(System.in); //Scanner classından scan isminde değerini system içinden alan bir obj.
/*
        //2. Adım -> Kullanıcıdan istenen veri için bildirimde bulunulur ->south("...");
        System.out.print("Adınızı Giriniz : ");

        //3. Adım -> Kullanıcının girdiği veri data tipine göre bir variableye atanır.
        String isim= scan.nextLine();//kullanıcıdan gelen veri
        System.out.println("isim = " + isim);  */

       /* Scanner kenar   = new Scanner(System.in);
        System.out.print("Kare Kenarı Giriniz : ");
        int ken= scan.nextInt();
        System.out.println("alan : "+(ken*ken)+" Çevre : "+(ken*4)); */

        /*
        Scanner  ccay= new Scanner(System.in
        System.out.println("Çay Adeti: ");
        int cadet= scan.nextInt();
        Scanner sek= new Scanner(System.in);
        System.out.println("Şeker Adeti: ");
        int seket= scan.nextInt();
        System.out.println("Yıllık Şeker Tüketimi : "+(cadet*seket*1.7*365/1000));
        */
        Scanner sec=new Scanner(System.in);
        System.out.println("İSminizi Giriniz");
        // char cd=sec.nextLine().charAt(0);
        // System.out.println("İsminizin İlk Karakteri = " + cd);
        // String isim=sec.nextLine();//kullanıcının girdiği tüm yazıyı alır
        String ad=sec.next();// kullanıcının girdiği ilk ifadeyi alır
        System.out.println("isim = " + ad);
    }
}
