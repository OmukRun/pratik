package j09_SwitchStatement;

import java.util.Scanner;

public class C04_Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("agam bir rakam gir bakam : ");
        int ay = sc.nextInt();
        //String ay= sc.nextLine();
        switch (ay) {
            case 12:
            case 1:
            case 2:
                System.out.println("Kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilk bahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;

            default:
                System.out.println("Yaz yeniden");
        }
    }
}