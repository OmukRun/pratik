package j10_StringManipulations;

import java.util.Scanner;

public class Task07m {
    public static void main(String[] args) {
        /*
        girilen string içindeki istenen indexteki karakteri print eden kod create ediniz.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Birşeyler gir : ");
        String kelime= scanner.nextLine();
        System.out.println("Hangi index : ");
        int ind= scanner.nextInt();
        if (kelime.length()>ind){
            System.out.println(kelime.charAt(ind));
        }else
            System.out.println("Ağam nettin kelime o kadar uzun değil");









    }

}
