public class PolaStatyczneTest {
    public static void main(String[] args) {

        PolaStatyczne janusz = new PolaStatyczne();
        janusz.imie = "Janusz";
        janusz.nazwisko = "Kowalski";
        janusz.nick = "JKowalski";
        janusz.email = "jkow@gmail.pl";
        janusz.numerIndeksu = 45326;
//        System.out.println(janusz.imie + " " + janusz.nazwisko +" studiuje na " + janusz.nazwaUczelni);
        janusz.infoUczelnia();

        PolaStatyczne piotr = new PolaStatyczne();
        piotr.imie = "Piotr";
        piotr.nazwisko = "Nowak";
        piotr.nick = "PNowak";
        piotr.email = "pinow@wp.pl";
        piotr.numerIndeksu = 69284;

        PolaStatyczne geralt = new PolaStatyczne();
        geralt.imie = "Geralt";
        geralt.nazwisko = "z Rivii";
        geralt.nick = "Biały Kieł";
        geralt.email = "sowa@jaskier.op";
        geralt.numerIndeksu = 583058;

        PolaStatyczne[] studenci = new PolaStatyczne[3];
        studenci[0] = janusz;
        studenci[1] = piotr;
        studenci[2] = geralt;

/*        for (int i = 0; i < studenci.length; i++) {
            studenci[i].przedstawSie();
            studenci[i].zalogujSie();
            studenci[i].podajNumerIndeksu();
            studenci[i].podajEmail();
        }*/
    }

}
