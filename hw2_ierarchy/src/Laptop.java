public class Laptop extends PortableComputer {
    private Display display;
    private Keyboard keyboard;
    public Laptop(String maker, String model, String cpu, String ram, String hardDrive) {
        super(maker, model, cpu, ram, hardDrive);
        this.display = new Display();
        this.keyboard = new Keyboard();
    }
}
