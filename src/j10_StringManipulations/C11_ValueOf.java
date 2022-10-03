package j10_StringManipulations;

public class C11_ValueOf {
    public static void main(String[] args) {


    String bagis1="1500";
    String bagis2="2500";

    int bdegeri1 = Integer.valueOf(bagis1);
    int bdegeri2 = Integer.valueOf(bagis2);

        System.out.println("Toplam Bağış Miktarı : " + (bdegeri1+bdegeri2));

    int fetih=Integer.valueOf("1453");
        System.out.println(fetih);






    }
}
