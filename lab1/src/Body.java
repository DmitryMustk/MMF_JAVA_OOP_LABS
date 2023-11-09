package src;

public class Body {
    private String colour;
    private boolean hasSpoiler;

    public Body(String colour) {
        this.colour = colour;
        this.hasSpoiler = false;
    }

    public void addSpoiler() {
        this.hasSpoiler = true;
    }

    public boolean hasSpoiler(){
        return hasSpoiler;
    }

    public String getColour() {
        return colour;
    }
}
