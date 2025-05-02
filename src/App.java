public class App {

    public String name;
    public String env;

    public App(String name, String env) {
        this.name = name;
        this.env = env;
    }

    public void appInfo() {
        System.out.println("Witamy w aplikacji "+ name + "!");
        System.out.println("Kompletny przewodnik to owocach sadowych!");
    }

    public String env() {
        return env;
    }
}
