package j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunu print eden code create ediniz
        // pazartesi hafta başlangıcı olarak alınız
        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\n Haftanın kaçıncı gününde olduğunu giriniz : ");
        int kacıncıGun = scan.nextInt();
        int sonra = kacıncıGun + 100;
        int gun = sonra % 7;
        switch (gun) {

            case 1:
                System.out.println("100 gün sonra Pazartesidir");
                break;
            case 2:
                System.out.println("100 gün sonra Salıdır");
                break;
            case 3:
                System.out.println("100 gün sonra Çarşambadır");
                break;
            case 4:
                System.out.println("100 gün sonra Perşembedir");
                break;
            case 5:
                System.out.println("100 gün sonra Cumadır");
                break;
            case 6:
                System.out.println("100 gün sonra cumartesidir");
                break;
            case 7:
                System.out.println("100 gün sonra Pazardır");
                break;
            default :
                System.out.println("Hatalı giriş");


    }
}}

