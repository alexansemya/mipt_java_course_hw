import java.util.List;
import java.util.SortedMap;

public class Game
{
    public static void main(String[] args) throws InterruptedException
    {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread
    {
        public static volatile boolean isWinnerFound = false;

        public static List<String> steps = List.of("Начало игры", "Сбор ресурсов", "Рост экономики", "Убийство врагов");

        protected Gamer gamer1 = new Gamer("Player 1", 3);
        protected Gamer gamer2 = new Gamer("Player 2", 1);
        protected Gamer gamer3 = new Gamer("Player 3", 5);

        public void run()
        {
            gamer1.start();
            gamer2.start();
            gamer3.start();

            while (!isWinnerFound){}
            //Ваш код
            gamer1.interrupt();
            gamer2.interrupt();
            gamer3.interrupt();
        }
    }

    public static class Gamer extends Thread
    {
        private int rating;

        public Gamer(String name, int rating)
        {
            super(name);
            this.rating = rating;
        }

        @Override
        public void run()
        {
            //Здесь может и должен быть ваш код
            String curPlayer = Thread.currentThread().getName();
            try
            {
                for (int i = 0; i < OnlineGame.steps.size(); i++) {
                    System.out.println(String.format("%1$s:%2$s", curPlayer, OnlineGame.steps.get(i)));
                    Thread.sleep(1000 / rating);
                }
                if (!OnlineGame.isWinnerFound)
                {
                    OnlineGame.isWinnerFound = true;
                    System.out.println(String.format("%s:победитель!", curPlayer));
                }
            }
            catch (Exception e)
            {
                System.out.println(String.format("%1$s:проиграл" , curPlayer));
            }


        }
    }
}