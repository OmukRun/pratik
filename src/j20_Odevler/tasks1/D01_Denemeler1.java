package j20_Odevler.tasks1;

import java.util.Scanner;

public class D01_Denemeler1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Adınız : ");
        String name1 = input.nextLine().toLowerCase();
        System.out.println("Diğer Adınız : ");
        String name2 = input.nextLine().toLowerCase();
        System.out.println(name1.length() % 2 == 0 ? name1.substring(0, name1.length() / 2) + name2 + name1.substring(name1.length() / 2) :
                "Adınız çift sayılı");
    }
}
