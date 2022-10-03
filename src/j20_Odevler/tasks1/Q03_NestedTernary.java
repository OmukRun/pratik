package j20_Odevler.tasks1;

public class Q03_NestedTernary {
    public static void main(String[] args) {
        char finalNotu='B';
        String result= finalNotu=='A'?"Gayet Başarılı":finalNotu=='B' ?"Başarılı":finalNotu=='C'? "Ha Gayret":"Diğerleri";
        System.out.println("result = " + result);


    }
}
