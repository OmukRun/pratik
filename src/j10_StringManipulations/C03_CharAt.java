package j10_StringManipulations;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {
        /*
        Chart() methodu parametre int olarak girilen index'tekichar değerini return eder.
        index değeri 0'dan başlar.
         */

        String sehir = "Istanbul";
        System.out.println(sehir.charAt(5));
        char besinciIndex = sehir.charAt(5);
        System.out.println("besinciIndex = " + besinciIndex);
        //son index karakteri -- length()-1
        System.out.println("sehir.charAt(sehir.length()-1) = " + sehir.charAt(sehir.length() - 1));
        //ilk index karakteri -- charAt(0)
        System.out.println("sehir.charAt(0) = " + sehir.charAt(0));

        //System.out.println("sehir.charAt(18) = " + sehir.charAt(18));
        //Trick -- CharAt() index boyutunu geçerse hata verir.



        Scanner sc = new Scanner(System.in);
        System.out.println("Bir kelime gir : ");
        String kelime = sc.nextLine();



        if (kelime.length() % 2 != 0){
            System.out.println(kelime.charAt(kelime.length() / 2));
        }else System.out.println("Girilen kelimenin orta karakteri yoktur");

    }
    }

