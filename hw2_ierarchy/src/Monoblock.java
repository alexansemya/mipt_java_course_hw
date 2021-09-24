public class Monoblock extends DesktopComputer{
    private Display display;
    public Monoblock(String maker, String model, String cpu, String ram, String hardDrive, Display display) {
        super(maker, model, cpu, ram, hardDrive);
        this.setDisplay(display);
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }
    @Override
    public String toString(){
        return (String.format("%1$s %2$s %3$s %4$s %5$s; %6$s;", getMaker(), getModel(), getCpu(), getRam(), getHarddrive(), getDisplay()));

    }

}

