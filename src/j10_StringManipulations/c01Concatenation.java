package j10_StringManipulations;

public class c01Concatenation {
    public static void main(String[] args) {

        /*
        Concat () methodu  içine(parametre) aldığı string variable'ı çalıştığı stringin sonuna ekler.
        Javada + işlemi yapılırken eğer en az bir string variable varsa java toplama değil concate yapar.

         */

        String name="Nur";
        String meslek="QA Tester";
        System.out.println (name.concat(meslek));//nur qa tester
        System.out.println(name);//nur
        // Trick: string methodları variable geçici değişiklik yapar. ama değişken atama yapılırsa kalıcı değişir.
        name = meslek.concat(name);
        System.out.println("name = " + name);
        System.out.println(name.concat(true +":)"));
        System.out.println(name.concat(100 +":)"));

        //Trick: Concat methodu parametre olarak string type harici tüm dataları stringe çevirip concat eder.


    }
}
