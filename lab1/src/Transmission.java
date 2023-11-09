package src;

public class Transmission {
    private int numberOfGears;
    private boolean isAutomatic;

    public Transmission(int numberOfGears, boolean isAutomatic){
        if(numberOfGears < 3 || numberOfGears > 7 || (!isAutomatic && numberOfGears < 4))
            throw new IllegalArgumentException("Invalid number of gears");

        this.numberOfGears = numberOfGears;
        this.isAutomatic = true;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }
}
