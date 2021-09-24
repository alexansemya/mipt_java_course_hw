public class Monoblock extends DesktopComputer{
    private Display display;
    public Monoblock(String maker, String model, String cpu, String ram, String hardDrive) {
        super(maker, model, cpu, ram, hardDrive);
        this.display = new Display();
    }
}

