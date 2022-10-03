package Musty.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _29_Scanner9 {

    public static void main(String[] args) {

    /*   kullanıcının boyunu
          Float print eden code create ediniz   */

        Scanner s = new Scanner(System.in);
        System.out.println("Boyunuz : ");
        String boy=s.nextLine();
        float x= Float.parseFloat(boy);
        System.out.println("x = " + x);


    }


}
