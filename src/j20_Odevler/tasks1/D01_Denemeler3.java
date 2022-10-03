package j20_Odevler.tasks1;

import java.util.Scanner;

public class D01_Denemeler3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Adınız : ");
        String name1 = input.nextLine().toLowerCase();
        System.out.println("SoyAdınız : ");
        String name2 = input.nextLine().toLowerCase();
        System.out.println(name1.length() != name2.length() ? name1.length() > name2.length() ?(" "+name1) : name2:"eşitler");

    }
}
