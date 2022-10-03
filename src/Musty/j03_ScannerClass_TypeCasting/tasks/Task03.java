package Musty.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */



        Scanner u = new Scanner(System.in);
        System.out.println("Günde Kaç Saat Uyuyorsunuz ?");
        int a = u.nextInt();
        System.out.println("Ayda : "+(a*30)/24 +" gün");
        System.out.println("Yılda : "+(a*365)/24 +" gün");
        System.out.println("40 Yılda : "+(a*365*40)/24 +" gün UYUYORSUNUZ");


    }
}
