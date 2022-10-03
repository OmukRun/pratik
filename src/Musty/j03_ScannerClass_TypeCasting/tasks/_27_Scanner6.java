package Musty.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _27_Scanner6 {

    public static void main(String[] args) {

    /*    kullanıcının
          Doğum gününü print eden code create ediniz */

        Scanner s = new Scanner(System.in);
        System.out.print("Doğum gününüz : ");
        String gun=s.nextLine();
        System.out.println("gun = " + gun.toLowerCase());


    }
}
