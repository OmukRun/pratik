package j20_Odevler.tasks1;

import java.util.Scanner;

public class D01_Denemeler5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("4 Harfli bişey gir ağam");
        String a = scan.nextLine();
        if (a.length()== 4) {
            System.out.println(" "+a.charAt(3)+a.charAt(2)+a.charAt(1)+a.charAt(0));
        } else
            System.out.println("Ağam netting.");
    }
}
