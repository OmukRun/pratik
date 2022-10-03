package j20_Odevler;

public class DegiskenSayi {
    public static void main(String[] args) {
         /*
        TASK :
        Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        code create edip print ediniz.
        a) 3. bir variable kulanarak
        b) 3. bir variable kullanmadan

	     input	: sayi1=20 ve sayi2=34;
		 output  :  sayi1=34 ve sayi2=20

         */


        int sayi1=20;
        int sayi2=34;


        System.out.println("*** a çözümü Variable kullanarak***");
        System.out.println("//Boş Bir Variable Oluşturup Sayı 1'i ona atayalım");
        System.out.println("int temp=sayi1; //temp oldu 20");
        int temp=sayi1;
        System.out.println("//Sonra sayı 1'e Sayı 2 Değerini atayalım");
        System.out.println("sayi1=sayi2; // sayi1 oldu 34");
        sayi1=sayi2;
        System.out.println("//Sayı 2 değerine temp değeri atayalım");
        System.out.println("sayi2=temp; //sayi2 oldu 20");
        sayi2=temp;
        System.out.println("//Sonra Bunları ekrana yazdıralım.");
        System.out.println("System.out.println(\"sayı1 : \" + sayi1 + \" , \" + \"Sayi2 : \" + sayi2);");
        System.out.println("sayı1 : " + sayi1 + " , " + "Sayi2 : " + sayi2);

        sayi1=20;
        sayi2=34;
        System.out.println("*** b çözümü ***");
        System.out.println("//Variable olmadan toplama çıkarma işlemleri yaparak");
        System.out.println("//Öncelikle sayılarımızı bi görelim");
        System.out.println("sayı1 : " + sayi1 +" , " + "Sayi2 : " + sayi2);
        System.out.println("//Başlangıçta sayi1 değerini işlemle değişicez");
        System.out.println("//sayi1=sayi1+sayi2");
        sayi1=sayi1+sayi2;
        System.out.println("Sayı1 in yeni değeri : " + sayi1);
        System.out.println("Sonrasında Sayi2 değerini işlemle değişiyoruz");
        System.out.println("//sayi2=sayi1-sayi2");
        sayi2=sayi1-sayi2;
        System.out.println("Sayı2 nin yeni değeri : " + sayi2);
        System.out.println("Sonrasında Sayi1 e hakettiği değeri veriyoruz");
        System.out.println("//sayi1=sayi1-sayi2");
        sayi1=sayi1-sayi2;
        System.out.println("Sayı1 in yeni değeri : " + sayi1);
        System.out.println("Sonra Bunları ekrana yazdıralım");
        System.out.println("System.out.println(\"Değişen sayı1 : \" + sayi1 +\" , \" + \"Değişen Sayi2 : \" + sayi2);");
        System.out.println("Değişen sayı1 : " + sayi1 +" , " + "Değişen Sayi2 : " + sayi2);
    }
}
