public class Rower implements Vehicle {
    @Override
    public void jazda(int speed) {
        System.out.println("Jadę rowerem z prędkością "+speed);
    }

    @Override
    public void stop() {
        System.out.println("Zatrzymuję się");
    }
}
