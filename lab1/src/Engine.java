package src;

public class Engine {
    private double volume;

    public Engine(double volume) {
        if (volume != 1.6 && volume != 2.4 && volume != 3.2)
            throw new IllegalArgumentException("Invalid engine volume");

        this.volume = volume;
    }

    public double getVolume(){
        return volume;
    }
}
