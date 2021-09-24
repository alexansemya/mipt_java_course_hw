public abstract class ComputerImpl implements Computer{
    private String maker;
    private String model;
    private String cpu;
    private String ram;
    private String hardDrive;
    public ComputerImpl(String maker, String model, String cpu, String ram, String hardDrive){
        this.setMaker(maker);
        this.setModel(model);
        this.setCpu(cpu);
        this.setRam(ram);
        this.setHarddrive(hardDrive);
    }

    //так мы избавляемся от дублирующего кода
    //в дальнейшем, все что нам нужно - переопределить метод toString
    @Override
    public String toString(){
        return (String.format("%1$s %2$s %3$s %4$s %5$s;", getMaker(), getModel(), getCpu(), getRam(), getHarddrive()));
    }
    public String turnOn() {
        return "Turn on "+getClass().getSimpleName()+" "+toString();
    }

    public String turnOff() {
        return "Turn off "+getClass().getSimpleName()+" "+toString();
    }

    public String connect() {
        return "Connect to internet "+getClass().getSimpleName()+" "+toString();
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHarddrive() {
        return hardDrive;
    }

    public void setHarddrive(String harddrive) {
        this.hardDrive = harddrive;
    }
}
