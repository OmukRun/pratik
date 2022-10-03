package j20_Odevler.tasks1;

import java.util.Scanner;

public class D01_Denemeler6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir String Giriniz : ");
        String a = scan.nextLine().toLowerCase();

        System.out.println(xyzVarmi(a));
    }

    private static boolean xyzVarmi(String a) {
        if (a.contains("xyz")){
            return true;
        }else
            return false;

    }
}
