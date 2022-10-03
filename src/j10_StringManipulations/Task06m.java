package j10_StringManipulations;

import java.util.Scanner;

public class Task06m {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Birşeyler gir : ");
        String s = scanner.nextLine();
        System.out.println(s.substring(0, s.length() - 1));



    }
}
