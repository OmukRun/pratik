package j20_Odevler.tasks1;

import java.util.Scanner;

public class Q08_SwitchCase2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("3 Basamaklı bir sayı giriniz : ");
        int sayi=scanner.nextInt();
        int yuzler=sayi/100, onlar=(sayi/10)%10, birler=sayi%10;
        if (sayi>=100 && sayi<1000){
            switch (yuzler){
                case 0:System.out.println("");break;
                case 1:System.out.println("yüz");break;
                case 2:System.out.println("ikiyüz");break;
                case 3:System.out.println("üçyüz");break;
                case 4:System.out.println("dörtyüz");break;
                case 5:System.out.println("beşyüz");break;
                case 6:System.out.println("altıyüz");break;
                case 7:System.out.println("yediyüz");break;
                case 8:System.out.println("sekizyüz");break;
                case 9:System.out.println("dokuzyüz");break;
            }
            switch (onlar){
                case 0:System.out.println("");break;
                case 1:System.out.println("on");break;
                case 2:System.out.println("yirmi");break;
                case 3:System.out.println("otuz");break;
                case 4:System.out.println("kırk");break;
                case 5:System.out.println("elli");break;
                case 6:System.out.println("altmış");break;
                case 7:System.out.println("yetmiş");break;
                case 8:System.out.println("seksen");break;
                case 9:System.out.println("doksan");break;
            }
            switch (birler){
                case 0:System.out.println("");break;
                case 1:System.out.println("bir");break;
                case 2:System.out.println("iki");break;
                case 3:System.out.println("üç");break;
                case 4:System.out.println("dört");break;
                case 5:System.out.println("beş");break;
                case 6:System.out.println("altı");break;
                case 7:System.out.println("yedi");break;
                case 8:System.out.println("sekiz");break;
                case 9:System.out.println("dokuz");break;
            }

        }else
        System.out.println("Istenilen özelliklerde bir sayı giriniz");

    }
}
