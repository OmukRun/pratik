package Musty.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */


        Scanner clarus = new Scanner(System.in);
        System.out.println("Clarusway Spor Salonuna Hoş Geldiniz");
        System.out.println("Adınız : ");
        String isim= clarus.nextLine();
        System.out.println("Soyadınız : ");
        String soyisim= clarus.nextLine();
        System.out.println("Yaşınız : ");
        int yas=clarus.nextInt();
        System.out.println("Kilonuz : ");
        int kilo=clarus.nextInt();
        System.out.println("Boyunuz : ");
        int boy=clarus.nextInt();
        System.out.println("Abonelik Süresi : ");
        int sure=clarus.nextInt();
        System.out.println(isim +" " +soyisim +" "+ "Ödenecek Ücret : " + sure*20+"$");
    }
}
