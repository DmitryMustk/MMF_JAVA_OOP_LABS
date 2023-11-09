package src;

public class Wheel {
    private int diameter;
    private String material;

    public Wheel(int diameter, String material) {
        if (diameter != 17 && diameter != 19 && diameter != 22)
            throw new IllegalArgumentException("Invalid wheel diameter");

        this.diameter = diameter;
        this.material = material;
    }

    public int getDiameter(){
        return diameter;
    }

    public String getMaterial(){
        return material;
    }
}
