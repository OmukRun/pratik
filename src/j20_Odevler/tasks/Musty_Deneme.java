package j20_Odevler.tasks;

import java.util.Scanner;

public class Musty_Deneme {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("5 basamaklı sayı giriniz : ");
            int x=scanner.nextInt();

            int onlar =x%100; //4;
            int binler = x/1000;//2

            int ilk=onlar/10;
            int ilk2=onlar%10;
            int iki1=binler/10;
            int iki2=binler%10;
        System.out.println(ilk+ilk2+iki1+iki2);


    }
}
