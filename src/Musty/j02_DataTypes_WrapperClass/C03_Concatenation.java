package Musty.j02_DataTypes_WrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {

        String ad="haluk";
        String soyad="bilgin";

        int a=7;
        int b=11;

        System.out.println(ad+soyad+a+b);
        System.out.println(a+ad+soyad+b);
        System.out.println(a+b+ad+soyad);
        System.out.println(" "+a+b);
        System.out.println(ad+soyad+(a+b));
        System.out.println((a+b)+ad+soyad);
        System.out.println(ad+(a-b)+(a-b));
        System.out.println(ad+((a-b)+(a-b)));


        char ch='1';
        System.out.println(ad+ch);
        System.out.println(a+ch+ad);
        System.out.println(ad+(ch+b));
        System.out.println(a+ad+ch);
    }
}
