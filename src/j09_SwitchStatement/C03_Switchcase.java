package j09_SwitchStatement;

import java.util.Scanner;

public class C03_Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("agam bir rakam gir bakam : ");
        int ay = sc.nextInt();
        switch (ay) {
            case 1:
                System.out.println("31");
                break;
            case 2:
                System.out.println("Yılınızı giriniz");
                int yil=sc.nextInt();
                if (yil%4==0) {
                    System.out.println("29");
                } else System.out.println("28");
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");

            default:
                System.out.println("Yaz yeniden");
        }
    }
}