public class PC extends DesktopComputer{
    private String videoCard;

    public PC(String maker, String model, String cpu, String ram, String hardDrive, String videoCard) {
        super(maker, model, cpu, ram, hardDrive);
        this.videoCard = videoCard;
    }
    @Override
    public String toString(){
        return (String.format("%1$s %2$s %3$s %4$s %5$s %6$s", getMaker(), getModel(), getCpu(), getRam(), getHarddrive(), getVideocard()));
    }
    public String getVideocard() {
        return videoCard;
    }

    public void setVideocard(String videocard) {
        this.videoCard = videocard;
    }
}
