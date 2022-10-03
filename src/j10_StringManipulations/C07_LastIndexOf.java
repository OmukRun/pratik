package j10_StringManipulations;

import java.util.Scanner;

public class C07_LastIndexOf {
    public static void main(String[] args) {
        /* indexOf()
 * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
 * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false

*/

        /*String s="Good of school";
        System.out.println("İlk görülen o nun yeri index nosu : "+s.indexOf('o'));
        System.out.println("İlk görülen od nun yeri index nosu : "+s.indexOf("od"));
        System.out.println("İlk görülen d nun yeri index nosu : "+s.indexOf('d'));
        System.out.println("Sondan ilk görülen o nun yeri index nosu : "+s.lastIndexOf('o'));

        String x="mustafa nizamoğlu";
        System.out.println("ilk görülen a " +x.indexOf('a'));
        System.out.println("Sondan ilk görülen a " +x.lastIndexOf('a'));
        System.out.println("ilk görülen fa " +x.indexOf("fa"));
        */

        Scanner cumle = new Scanner(System.in);
        System.out.println("Cümle giriniz : ");
        String c1 = cumle.nextLine().toLowerCase();
        String k1="java";
        System.out.println(c1.contains(k1) ? (c1.indexOf(k1) == c1.lastIndexOf(k1) ? "1 tane Java" : "1 den fazla") : "Java yok");


    }
}
