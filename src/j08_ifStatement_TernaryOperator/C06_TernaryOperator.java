package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C06_TernaryOperator {
    public static void main(String[] args) {
        /*
 TASK :
Kullanicidan bir sayi aliniz
Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Agam Sayı gir");
        int sayi = scanner.nextInt();
        System.out.println(sayi>=0 ? (sayi<10 ? "Rakam":"Pozitif Sayi") :"Negatif Sayi");


    }
    }