public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyClock clock = new MyClock();
        clock.start();
        Thread.sleep(5000);
        clock.interrupt();

    }
}
