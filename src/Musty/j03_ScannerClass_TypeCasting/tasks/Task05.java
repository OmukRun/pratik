package Musty.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
		
	Scanner in = new Scanner(System.in);
		System.out.println("Tam sayı Giriniz");
		int a=in.nextInt();
		System.out.println("Tekrar bi Tam sayı giriniz");
		int b=in.nextInt();
		System.out.println("Çarpma : "+a*b);
		System.out.println("Bölme : "+(a/b));
		System.out.println("Toplama : "+(a+b));
		System.out.println("Çıkarma : "+(a-b));

	}

}
