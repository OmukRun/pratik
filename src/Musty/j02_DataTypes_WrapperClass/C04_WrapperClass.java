package Musty.j02_DataTypes_WrapperClass;

public class C04_WrapperClass {
    public static void main(String[] args) {
        /*
        String name = "MuSTaFa";

        int yas = 33;

        System.out.println(name.toUpperCase());
        */

        // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
        // ancak primitive data turlerinin boyle bir ozelligi yoktur
        // primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
        //Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
        // olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
        // ara çözüm imkanı sunmuştur.

       /*
       String tc="123456789";
        String id="98765";
   int yenitc=Integer.valueOf(tc);
   int ide=Integer.valueOf(id);

        System.out.println("yenitc = " + yenitc);
        System.out.println("ide = " + ide);
        System.out.println(yenitc+ide);
*//*
        String OkulNo="98765l";
        int YeniOkulNo=Integer.valueOf(OkulNo);
        System.out.println("YeniOkulNo = " + YeniOkulNo);
        */

        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);

        System.out.println("Byte.TYPE = " + Byte.TYPE);

    }
}
