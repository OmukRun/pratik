package j20_Odevler.tasks1;

public class Q06_NestedIfTernary {
    public static void main(String[] args) {
        int num=6;
        String result="";
        if (num>=0 && num<=9){
            if (num == 9){
                result="nine";
            }else if(num==8){
                result="eight";
            } else if (num==7){
                result="seven";
            }else if (num==6){
                result="six";
            }else if (num==5){
                result="five";
            }else if (num==4){
                result="four";
            }else if (num==3){
                result="three";
            }else if (num==2){
                result="two";
            }else if (num==1){
                result="one";
            }else
                result="zero";
        }else
            result="Geçersiz bir sayı";

        System.out.println("result = " + result);

        int n=4;
        String result2= n==9?"nine":n==8?"eight":n==7?"seven":n==6?"six":n==5?"Five":n==4?"Four":n==3?"Three":n==2?"Two":n==1?"One":"Invalid";
        System.out.println("result2 = " + result2);


    }
}
