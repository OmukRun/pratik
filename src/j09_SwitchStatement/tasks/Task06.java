package j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz

		Scanner sc = new Scanner(System.in);
		System.out.println("Harfi Giriniz ");
		char ch=sc.next().charAt(0);
		switch(ch)
        {
            case 'V':
			case 'v':
				System.out.println("Very");
				break;
			case 'İ':
			case 'i':
			case 'I':
			case 'ı':
				System.out.println("Important");
				break;
			case 'P':
			case 'p':
				System.out.println("Person");
				break;
			default:
				System.out.println("Hatalı giriş yaptınız");




	}
}}
