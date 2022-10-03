package j10_StringManipulations;

import java.util.Scanner;

public class C04_Contains {
    public static void main(String[] args) {
        /*
        Contains String içerisinde istenen stringin varlığını kontrol eder ve boolean olarak sonuç verir.
         */

        String s1="Enise Hanım Başarılı bir QA tester team lead";
        System.out.println(s1.contains("hanım"));//false
        System.out.println(s1.contains("E"));//True
        System.out.println(s1.contains(" "));//True

        String s2="QA";
        System.out.println(s1.contains(s2));//True
        System.out.println(s2.contains(s1));//False


        Scanner sc = new Scanner(System.in);
        System.out.println("Bir cümle yaz : ");
        String cumle=sc.nextLine();
        System.out.println("Aranan kelime : ");
        String kelime=sc.nextLine();
        System.out.println(cumle.contains(kelime) == true ? "Kelime var" : "Kelime yok");

    }
}
