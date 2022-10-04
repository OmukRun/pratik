package j20_Odevler.tasks1;

import java.util.Scanner;

public class D01_Denemeler9 {

    /*
Kullanicidan bir tam sayi alin.
Bu sayinin negatif veya pozitif oldugunu,
tek mi cift mi oldugunu ve
uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
100'den kucukse sadece birler basamagini yazdirin.
*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayı giriniz  ");
        int sayi = scan.nextInt();

        pozitifNegatif(sayi);
        System.out.println(D01_Denemeler7.isEven(sayi));
        System.out.println(sayi >= 100 ? (yuzdeBuyuk(sayi)) : (yuzdenKucuk(sayi)));

    }

    private static int yuzdenKucuk(int sayi) {
        return sayi%10;
    }

    private static int yuzdeBuyuk(int sayi) {
        int birler = sayi%10, onlar= (sayi/10)%10, yuzler = sayi/100;
        int toplam=0;
        toplam=birler +onlar+yuzler;
        return toplam;
    }

    private static void pozitifNegatif(int sayi) {
        System.out.println(sayi>0 &&sayi!=0?"Pozitif":"Negatif");
    }
}