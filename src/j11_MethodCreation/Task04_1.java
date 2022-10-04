package j11_MethodCreation;

import java.util.Scanner;

public class Task04_1 {
    /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
     ATM app. code create ediniz
     */

   static Scanner sc = new Scanner(System.in);
   static int bakiye = 1000;
    public static void main(String[] args) {

        System.out.print("***");
        System.out.print("*** ATM'ye Hoş Geldiniz ***");
        System.out.print("***");
        System.out.println("MÖNÜÜÜÜ :) \nBakiye öğrenme 1 \n Para yatırma 2 \n Para Çekme 3 \n Çıkış 4 \n Giriniz : ");
        secim();



    }

    public static void secim() {
        System.out.println("Ağam yapacağın işlemi seç : ");
        int secim=sc.nextInt();
        switch (secim) {
            case 1:
                bakiyeVer();
                break;
            case 2:
                paraYatir();
                break;
            case 3:
                paraCek();
                break;
            case 4:
                Cikis();
                break;
            default:
                System.out.println("Ağam daha seçim yapamirsen bide daha para istirsen...");
        }
    }

    private static void Cikis() {
        System.out.println("Ağam görüşürük. Çav. :) ");
    }

    private static void paraCek() {
        System.out.println("Ağam etme ne kadar çekcen : ");
        int cekilecekMiktar = sc.nextInt();
        if (cekilecekMiktar <=bakiye) {
            bakiye-=cekilecekMiktar;
            System.out.println("Ağam para cebinde, gözünggg Aydın :) ");
            System.out.println("Ağam Bakiyen : "+bakiye);
        } else System.out.println("Ağam nidding olmayan parayımı çekcennn :( ");
        karar();
    }

    private static void paraYatir() {
        System.out.println("Ağam elin tutulmaz, ne gada yatırcen  : ");
        int yatacakMiktar=sc.nextInt();
        bakiye+=yatacakMiktar;
        System.out.println("Ağam para hesabında, ahanda yeni bakiyen :" +bakiye);
        karar();
    }

    private static void bakiyeVer() {
        System.out.println("Ağam Bakiyen : "+bakiye);
        karar();
    }

    public static void karar(){
        System.out.println("Ağam İşleme \n dewamkeeee -> 1\nyeter ->0");
        int karar=sc.nextInt();
        if (karar==1){
            secim();
        }else if (karar==0)Cikis();
        else System.out.println("Ağam düzgün bişey gir allasen");
    }

}
