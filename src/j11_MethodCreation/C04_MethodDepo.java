package j11_MethodCreation;

public class C04_MethodDepo {
    //main method olmayacak

    public static void gecmeNotu(int not){


        if (not>=85){
            System.out.println("ağam tebrik çoook başarılısın.");
        }else if (not>=70){
            System.out.println("ağam başarılı :)");
        }else if (not>=60){
            System.out.println("ağam sadece geçtin");
        }else if (not>=45){
            System.out.println("ağam ucuz yırttın");
        }else System.out.println("ağam fena çaktın :(");

    }
}
