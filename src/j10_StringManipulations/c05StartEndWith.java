package j10_StringManipulations;

public class c05StartEndWith {
    public static void main(String[] args) {
        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *  String'in basladigi characteri dogrular
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */
        String sehir="istanbul";
        System.out.println(sehir.startsWith("i"));//True
        System.out.println(sehir.startsWith("is"));//True
        System.out.println(sehir.startsWith("s"));//False
        System.out.println(sehir.startsWith( "t",2));//true 3. indexten itibaren string a ile mi başlar
        System.out.println(sehir.endsWith("l"));//True
        System.out.println(sehir.endsWith("bul"));//True
        System.out.println(sehir.endsWith("bu"));//False


        String str="bul";
        System.out.println(sehir.endsWith(str));//true
        int yas=48;
        //sehir.endsWith(yas);


    }
}
