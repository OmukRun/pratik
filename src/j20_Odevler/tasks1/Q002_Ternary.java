package j20_Odevler.tasks1;

public class Q002_Ternary {
    public static void main(String[] args) {
        double fiyat=350;
        String result= fiyat<10 ? "ucuz":fiyat<20?"normal":"pahali";
        System.out.println("result = " + result);
    }
}
