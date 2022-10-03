package j09_SwitchStatement.tasks;

import java.util.Locale;
import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */
		Scanner veri = new Scanner(System.in);
		System.out.println("Lütfen Ay'ı belirtiniz");
		String ay = veri.nextLine().toLowerCase(Locale.ROOT);
		switch (ay) {
			case "ocak":
			case "mart":
			case "mayıs":
			case "temmuz":
			case "ağustos":
			case "ekim":
			case "aralık":
				System.out.println("girilen ay 31 gün içerir");
				break;
			case "nisan":
			case "haziran":
			case "eylül":
			case "kasım":
				System.out.println("girilen ay 30 gün içerir");
				break;
			case "şubat":
				System.out.print("yılınızı giriniz : ");
				int yil = veri.nextInt();
				if (yil % 4 == 0) {
					System.out.println("girilen ay subat ayı 29 gün içerir ");
				} else System.out.println("girilen ay subat ayı 28 gün içerir");
				break;
			default:
				System.out.println("adam gibi bişey gir :( ");
		}

	}
}