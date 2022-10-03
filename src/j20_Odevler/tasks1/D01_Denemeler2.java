package j20_Odevler.tasks1;

import java.util.Scanner;

public class D01_Denemeler2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("D01_Denemeler2D01_Denemeler2");
        String a = scan.nextLine();
        if (a.length() % 2 != 0 && a.length() >= 3) {
            System.out.println("Ortadaki harf: " + a.substring(a.length() / 2, (a.length()) / 2 + 1));
        } else
            System.out.println("Ağam netting.");
    }
}
