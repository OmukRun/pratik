package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C08_NestedTernaryOperator {
    public static void main(String[] args) {
   /*
 Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 100 den fazla ise
       %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Agam miktar gir");
        int miktar = scanner.nextInt();
        System.out.println("Agam fiyat gir");
        int fiyat=scanner.nextInt();
        double fatura = miktar>100 ? (miktar*fiyat*0.67) : miktar*fiyat;
        System.out.println(fatura);

    }
    }