package j11_MethodCreation;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //task-> girilen iki sayının eşitliğini kontrol eden method create ediniz...

        Scanner sc = new Scanner(System.in);
        System.out.print("Adınızı giriniz : ");
        String ad=sc.next();

        System.out.print("Soyadınızı giriniz : ");
        String soyad=sc.next();

        isimHarfKontrol (ad, soyad);


    }//main sonu

    private static void isimHarfKontrol(String ad, String soyad) {
        ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
        System.out.println("ad soyad = " + ad + " " + soyad);
    }


}
