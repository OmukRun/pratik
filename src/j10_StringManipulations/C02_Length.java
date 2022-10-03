package j10_StringManipulations;

public class C02_Length {
    public static void main(String[] args) {
        /*
        Length methodu girilen stringin uzunluğunu: içinde bulunan karakter sayısını bildirir.
        bütün karakterleri sayıp adedini verir.
         */
        String str="Madem geldin dünyaya, otur çalış javaya";
        int strKrkterSayisi= str.length();//int type bir data verir.
        System.out.println("str = " + str);
        System.out.println("strKrkterSayisi = " + strKrkterSayisi);

        String str1="";
        System.out.println(str1.length());//0

        String str2=" ";
        System.out.println(str2.length());//1


        String str3=null;
        System.out.println("str3.length() = " + str3.length());//Run time error
        //Trick: Null  atanan stringler ile string method çalışmaz. Cıss
        /*
        Null case sensitivedir. Yani Null veya null yazılamaz.
        Null bir değer değildir (dutluk) sadece hiçliği gösteren bir pointerdir.
         */

        String name;//deklare edilmiş ama atanmamış string ile string method çalışmaz.
        // name.concat(str1);

    }
}
