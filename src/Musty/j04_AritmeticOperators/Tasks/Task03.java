package Musty.j04_AritmeticOperators.Tasks;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("3 Basamaklı Sayı Giriniz");
		int sayi = sc.nextInt();
		System.out.println("Toplam = "+((sayi/100) + (sayi%10)));

	}

}
