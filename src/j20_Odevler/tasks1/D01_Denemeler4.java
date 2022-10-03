package j20_Odevler.tasks1;

import java.util.Scanner;

public class D01_Denemeler4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birşeyler Gir Ağam : ");
        String name1 = input.nextLine();
        int bosluk = name1.indexOf(" ");

        if (bosluk == -1 && !name1.isEmpty()) {
            System.out.println("Şartlara uygun");
        }else System.out.println("Şartlara uygun değildir.");


    }
}
