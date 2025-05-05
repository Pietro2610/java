public class Truck implements Vehicle{
    @Override
    public void jazda(int speed) {
        System.out.println("Jadę ciężarówką");
    }

    @Override
    public void stop() {
        System.out.println("Hamuję ciężarówką");
    }
}
