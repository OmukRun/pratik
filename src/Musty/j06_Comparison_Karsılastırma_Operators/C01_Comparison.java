package Musty.j06_Comparison_Karsılastırma_Operators;

public class C01_Comparison {
    public static void main(String[] args) {

        /*

==     Esit               x == y
!=     Esit degil         x != y
>      buyuk              x > y
<      kucuk              x < y
>=     buyuk esit         x >= y
<=     kücük esit         x <= y

 */


        int slmYs=33;
        int krmYs=41;


        System.out.println("Krm b esit mi Slm B -> "+(krmYs==slmYs));
        System.out.println("Krm b esit değil mi Slm B -> "+(krmYs!=slmYs));
        System.out.println("Krm b kucuk mu Slm B -> "+(krmYs<slmYs));
        System.out.println("Krm b buyuk mu Slm B -> "+(krmYs>slmYs));


        String name="kerem bey";
        String name1="kerem bey1";

        System.out.println(name1==name);



    }
}
