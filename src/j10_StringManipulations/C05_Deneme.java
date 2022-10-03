package j10_StringManipulations;

import java.util.Scanner;

public class C05_Deneme {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("E mail hesabınızı giriniz : ");
        String mail = scan.nextLine();
        if (!mail.contains("@gmail.com")) {
            System.out.println("Lutfen gmail hesabı giriniz.");
        } else if (mail.endsWith("@gmail.com")) {
            System.out.println("Hesabınız onaylandı ");
        } else {
            System.out.println("geçerli hesap giriniz");
        }

    }
}
