package j10_StringManipulations;

import java.util.Scanner;

public class C09_Replace_ReplaceAll {
    public static void main(String[] args) {
// replaceAll() method u replace() methoduna benzer ama 2 fark vardır
//1-replace() methodu char kabul eder ama replaceAll kabul etmez
//2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)
//(Regular Expressions)
//   \\s bosluk (
//   \\S bosluk disindaki tum karakterler
//   \\w harfler ve rakamlar (a z A Z, 0 9)
//   \\W harfler ve rakamlar disindaki tum karakterler
//   \\d rakamlar 0 9
//   \\D rakamlar disindaki tum karakterler



        /*String m="javaCAN'lara selam olsun :) java ile 123456789952124566 offer    ******      ";
        System.out.println(m.replace('a', '@'));
        System.out.println(m.replace("can", "kan"));
        System.out.println(m.replaceFirst("a", "o"));
        System.out.println(m.replaceAll("\\s", "+"));
        System.out.println(m.replaceAll("\\S", "+"));
        System.out.println(m.replaceAll("\\w", "+"));
        System.out.println(m.replaceAll("\\W", "+"));
        System.out.println(m.replaceAll("\\d", "+"));
        System.out.println(m.replaceAll("\\D", "+"));*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adınız Soyadınız : ");
        String isim = scanner.nextLine();
        System.out.println("Soyadınız : ");
        String soyad = scanner.nextLine();
        System.out.println("Kart numaranız");
        String no=scanner.nextLine();
        String yeniisim=isim.charAt(0)+isim.substring(1).replaceAll("\\w","*");
        String yenisoyad=soyad.charAt(0)+soyad.substring(1).replaceAll("\\w","*");
        String yenino="**** **** **** " + no.substring(12);
        System.out.println("İsim Soyisim : "+yeniisim+yenisoyad+"\n Kart No : "+yenino);



    }
}
