package Musty.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */
        Scanner del= new Scanner(System.in);
        System.out.println("Mesafe : ");
        int mes= del.nextInt();
        System.out.println("Hız : ");
        int hiz= del.nextInt();
        System.out.println("Süreniz : "+(mes/hiz)+" saat.");


    }
}
