package Musty.j04_AritmeticOperators.Tasks;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("İnek ve Koyun Sayısı : ");
        int dort=in.nextInt();
        System.out.println("Tavuk Sayısı : ");
        int iki=in.nextInt();
        System.out.println("Toplam Sayı : "+((dort*4)+(iki*2)));



    }

}
