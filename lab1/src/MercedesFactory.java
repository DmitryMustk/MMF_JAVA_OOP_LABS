package src;

import java.util.List;
import java.util.ArrayList;

class MercedesFactory implements CarFactory {
    @Override
    public Builder createBuilder() {
        return new MercedesBuilder();
    }

    @Override
    public Body createBody(String color) {
        return new Body(color);
    }

    @Override
    public List<Wheel> createWheels() {
        List<Wheel> wheels = new ArrayList<>();
        wheels.add(new Wheel(19, "Alloy"));
        return wheels;
    }

    @Override
    public Engine createEngine(double volume) {
        return new Engine(Math.max(volume, 2.4));
    }

    @Override
    public Transmission createTransmission(int numberOfGears, boolean isAutomatic) {
        return new Transmission(Math.max(numberOfGears, 5), true);
    }

    @Override
    public SteeringGear createSteeringGear(boolean powerSteering) {
        return new SteeringGear(powerSteering);
    }
}
