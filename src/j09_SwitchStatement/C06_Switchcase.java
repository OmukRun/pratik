package j09_SwitchStatement;

import java.util.Scanner;

public class C06_Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("agam bir gün gir bakam : ");
        String gun= sc.nextLine().toUpperCase();
        switch (gun) {
            case "PAZARTESİ":
            case "SALI":
            case "ÇARŞAMBA":
            case "PERŞEMBE":
            case "CUMA":
                System.out.println("Hafta İçi");
                break;
            case "CUMARTESİ":
            case "PAZAR":
                System.out.println("Hafta Sonu");
                break;
            default:
                System.out.println("Gün yaz ağam");
        }
    }
}