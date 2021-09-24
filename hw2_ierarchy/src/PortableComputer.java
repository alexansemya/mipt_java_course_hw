public abstract class PortableComputer extends ComputerImpl {
    private Keyboard keyboard;
    private Display display;
    public PortableComputer(String maker, String model, String cpu, String ram, String hardDrive, Keyboard keyboard, Display display) {
        super(maker, model, cpu, ram, hardDrive);
        this.setKeyboard(keyboard);
        this.setDisplay(display);
    }
    @Override
    public String toString(){
        return (String.format("%1$s %2$s %3$s %4$s %5$s; %6$s %7$s;", getMaker(), getModel(), getCpu(), getRam(), getHarddrive(), getKeyboard().toString(), getDisplay().toString()));
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }
}
