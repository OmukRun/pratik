package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ağam sayı gir: ");
        int s = scanner.nextInt();
        if (s == 1) {}
        //System.out.println(s>9 ? "Sayı 2 veya daha fazla basamaklı" : "Sayı tek basamaklı" );
        String sonuc=s>9 ? "Sayı 2 veya daha fazla basamaklı" : "Sayı tek basamaklı";
        System.out.println("sonuc = " + sonuc);


    }


}
