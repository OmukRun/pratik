package j09_SwitchStatement;

import java.util.Scanner;

public class C05_Switchcase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Bakiye öğrenme 1 \n Para yatırma 2 \n Para Çekme 3 \n Çıkış 4 \n Giriniz : ");
        int secim=sc.nextInt();
        int bakiye = 1000;
    switch (secim) {
    case 1:
        System.out.println("Ağam bakiyen = " + bakiye);
        break;

    case 2:
        System.out.println("Ağam ne kadar yatırıcan");
        int yatcak=sc.nextInt();
        bakiye+=yatcak;
        System.out.println("Ağam güncel bakiyen : " +bakiye);
        break;

    case 3:
        System.out.println("Ağam ne kadar çekicen");
        int cekcek=sc.nextInt();
        if (cekcek>bakiye){
            System.out.println("Ağam bakiyen yetmiyor");
            System.out.println("Ahanda bakiyen : " +bakiye);
        }else
        bakiye-=cekcek;
        System.out.println("Ağam güncel bakiyen : " +bakiye);
        break;

    case 4:
        System.out.println("Ağam yine bekleriz");
        break;

    default:
        System.out.println("Hatalı giriş yaptınız");


}
        }
    }
