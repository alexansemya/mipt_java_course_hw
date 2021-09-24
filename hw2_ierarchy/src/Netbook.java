import java.security.Key;

public class Netbook extends PortableComputer{
    private Display display;
    private Keyboard keyboard;

    public Netbook(String maker, String model, String cpu, String ram, String hardDrive) {
        super(maker, model, cpu, ram, hardDrive);
        this.display = new Display();
        this.keyboard = new Keyboard();
    }
}
