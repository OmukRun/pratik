package j11_MethodCreation;

import java.util.Scanner;

import static j11_MethodCreation.C01_MEthodCreation.topla;

public class Task03 {
    public static void main(String[] args) {
        //task-> girilen iki sayıyı seçilen dört işleme göre hesaplayan method create ediniz...

        Scanner sc = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        double sayı1 = sc.nextDouble();

        System.out.print("2. sayıyı giriniz : ");
        double sayı2 = sc.nextDouble();

        System.out.print("İşleminizi giriniz : ");
        char islem = sc.next().charAt(0);
        islemMenu(islem,(int)sayı1,(int)sayı2);


    }//main sonu
    public static void islemMenu(char ch,int x,int y) {
        switch (ch){
            case '+':
                topla(x,y);
                break;
            case '-':
                cikar(x,y);
                break;
            case '*':
                carp(x,y);
                break;
            case '/':
                bol(x,y);
                break;
            default:
                System.out.println("Hatalı seçim yaptınız");

        }




} public static void topla(int a, int b) {
        System.out.println("a+b = " + (a + b));
    }

    public static void carp(int a, int b) {
        System.out.println("a*b = " + (a * b));
    }

    public static void cikar(int a, int b) {
        System.out.println("a-b = " + (a - b));
    }

    public static void bol(int a, int b) {
        System.out.println("a/b = " + (a / b));
    }}


