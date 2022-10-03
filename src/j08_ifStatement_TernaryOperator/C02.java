package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.print("1. sayıyı giriniz : ");
        double say1= sc.nextDouble();
        System.out.print("2. sayıyı giriniz :  ");
        double say2= sc.nextDouble();
        System.out.print("İşlemi giriniz :");
        char c1= sc.next().charAt(0);

        if(c1=='*'){
            System.out.println(say1*say2);
        }else if(c1=='+'){
            System.out.println(say1+say2);
        } else if (c1=='-') {
            System.out.println(say1-say2);

        } else if (c1=='/') {
        System.out.println(say1/say2);
        }else {
            System.out.println("işlem yok");


    }}}