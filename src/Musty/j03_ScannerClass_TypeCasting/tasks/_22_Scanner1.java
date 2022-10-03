package Musty.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _22_Scanner1 {

    public static void main(String[] args) {

    /*    kullanıcının ismini print eden code create edin

     */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adınızı Giriniz : ");
        String isim= scanner.nextLine();
        System.out.println("isim = " + isim);

        Scanner sc= new Scanner(System.in);
        System.out.println("Adınızı Giriniz : ");
        String musty= scanner.nextLine();
        System.out.println("musty = " + musty);
    }
}
