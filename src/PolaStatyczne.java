public class PolaStatyczne {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;
    public static String nazwaUczelni = "AGH";
    public static void infoUczelnia() {
        System.out.println("Moja uczelnia to AGH");
    }

    public void przedstawSie() {
        System.out.println("Nazywam sie "+imie+" "+nazwisko);
    }

    public void zalogujSie() {
        System.out.println("Loguje za pomoca konta "+nick);
    }

    public void podajNumerIndeksu() {
        System.out.println("Moj nr indeksu to "+numerIndeksu);
    }

    public void podajEmail() {
        System.out.println("Moj adres email to "+email);
    }
}
