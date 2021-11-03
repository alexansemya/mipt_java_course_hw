public class Main {
    public static void main(String[] args) {
        Thread runnable = new Thread(new RunnableThread());
        ExtendedThread extended = new ExtendedThread();
        runnable.start();
        extended.start();
    }
}
