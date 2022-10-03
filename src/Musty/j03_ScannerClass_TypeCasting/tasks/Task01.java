package Musty.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
       /*
        Ask user to enter mid-term grade, final grade, and project grade
        Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)
        Kullanıcıdan ara sınav notunu, final notunu ve proje notunu girmesini isteyin Genel notu hesaplayın
        Example:
        INPUT: mid-term grade=78
        final grade = 66
        project grade = 90
        OUTPUT: "Your grade is : 81,6"
              */

        Scanner sc = new Scanner(System.in);
        System.out.println("Ara Sınav Notu: ");
        int a = sc.nextInt();
        System.out.println("Final Notu: ");
        int b = sc.nextInt();
        System.out.println("Proje Notu: ");
        int c = sc.nextInt();
        System.out.println("Genel Notunuz = " +((a*0.3) + (b*0.2)+(c*0.5)));





    }
}
