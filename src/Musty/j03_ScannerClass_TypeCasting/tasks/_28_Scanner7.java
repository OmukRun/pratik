package Musty.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */



        boolean x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir Banka Hesabınız Var mı ? ");
        x=sc.nextBoolean();
        System.out.println("x = " + x);


    }
}
