public class MyClock extends Thread {
    @Override
    public void run(){
        String[] sounds = {"Tik", "Tak"};
        int i = 0;
        while (!Thread.currentThread().isInterrupted()) {
            try {
                String current_sound = sounds[i % 2];
                System.out.println(current_sound);
                i++;
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread has been stopped");
                break;
            }
        }
    }
}
