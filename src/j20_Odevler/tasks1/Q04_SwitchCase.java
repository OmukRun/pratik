package j20_Odevler.tasks1;

public class Q04_SwitchCase {
    public static void main(String[] args) {
        /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/

    String day="day of";
    switch (day){
        case "Monday":
        case "Tuesday":
            System.out.println("Java Class");
            break;
        case "Thursday":
        case "Friday":
            System.out.println("Selenium Class");
            break;
        case "Saturday":
        case "Wednesday":
            System.out.println("SQL Class");
            break;
        default:
            System.out.println("Day Off");


    }
}}
