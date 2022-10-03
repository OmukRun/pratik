package j20_Odevler.tasks1;

import java.util.Scanner;

public class Q07_SwitchCase1 {
    public static void main(String[] args) {
        /*
      * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
      * ornek
      *  Kullanici  : A , B , C harflerinden birini secsin
          A'yi secmis ise, ==> Java is easy
          B'yi secmis ise, ==> Java is fun
          C'yi secmis ise, ==> I need to study :)
      */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Harf giriniz : \nA \nB \nC");
        char sec=scanner.next().toUpperCase().charAt(0);
        switch(sec) {
            case 'A':
                System.out.println("Java is easy");
                break;
            case 'B':
                System.out.println("Java is fun");
                break;
            case 'C':
                System.out.println("I need to study :)");
                break;
            default:
                System.out.println("Harfi düzgün yaz ağam");
    }
}}
