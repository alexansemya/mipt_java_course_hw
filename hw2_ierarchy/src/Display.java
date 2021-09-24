public class Display{
    private String resolution;
    private String diagonal;
    public Display(String resolution, String diagonal){
        this.setDiagonal(diagonal);
        this.setResolution(resolution);
    }
    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }
    @Override
    public String toString(){
        return (String.format("%1$s %2$s inches Display", getResolution(), getDiagonal()));
    }
}
