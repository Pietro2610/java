public class PracaDomowa4 {
    public static void main(String[] args) {


        Student janusz = new Student();
        janusz.imie = "Janusz";
        janusz.nazwisko = "Kowalski";
        janusz.nick = "JKowalski";
        janusz.email = "jkow@gmail.pl";
        janusz.numerIndeksu = 45326;

        Student piotr = new Student();
        piotr.imie = "Piotr";
        piotr.nazwisko = "Nowak";
        piotr.nick = "PNowak";
        piotr.email = "pinow@wp.pl";
        piotr.numerIndeksu = 69284;

        Student geralt = new Student();
        geralt.imie = "Geralt";
        geralt.nazwisko = "z Rivii";
        geralt.nick = "Biały Kieł";
        geralt.email = "sowa@jaskier.op";
        geralt.numerIndeksu = 583058;

        Student[] studenci = new Student[3];
        studenci[0] = janusz;
        studenci[1] = piotr;
        studenci[2] = geralt;

        for (int i = 0; i < studenci.length; i++) {
            studenci[i].przedstawSie();
            studenci[i].zalogujSie();
            studenci[i].podajNumerIndeksu();
            studenci[i].podajEmail();


        }
    }

}
