package j10_StringManipulations;

public class C08_Equals_equalsIgnoreCase {
    public static void main(String[] args) {
        String m="Mustafa";
        String k="mustafa ";
        System.out.println(k.equals(m));
        System.out.println(m.equals(k));
        System.out.println(k.equalsIgnoreCase(m));

        k="MuStaFa";
        System.out.println(k.equals(m));
        System.out.println(m.equals(k));
        System.out.println(k.equalsIgnoreCase(m));
        System.out.println(m.equalsIgnoreCase(k));

        String s1="songul hanım";
        String s2="songul hanım";
        String s3=new String("songul hanım");
        String s4=new String("songul hanım");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));


    }
}
