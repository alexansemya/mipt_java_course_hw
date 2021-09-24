public class Keyboard {
    private String layout;
    private String type;
    public Keyboard(String layout, String type){
        this.setLayout(layout);
        this.setType(type);
    }
    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString(){
        return (String.format("%1$s layout %2$s Keyboard;", getLayout(), getType()));
    }
}
