package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C01_ifStatement {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.print("bir şeyler giriniz : ");

        char ch = sc.nextLine().charAt(0);
        if ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
            System.out.println("girdiğiniz karakter harftir : ");

        } else System.out.println("girdiğiniz karakter harf değildir : ");

    }
}
