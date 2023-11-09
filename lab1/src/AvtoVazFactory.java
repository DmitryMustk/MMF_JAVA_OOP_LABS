package src;

import java.util.ArrayList;
import java.util.List;

class AvtoVAZFactory implements CarFactory {
    @Override
    public Builder createBuilder() {
        return new AvtoVAZBuilder();
    }

    @Override
    public Body createBody(String color) {
        return new Body(color);
    }

    @Override
    public List<Wheel> createWheels() {
        List<Wheel> wheels = new ArrayList<>();
        wheels.add(new Wheel(17, "Steel"));
        return wheels;
    }

    @Override
    public Engine createEngine(double volume) {
        return new Engine(Math.min(volume, 2.4));
    }

    @Override
    public Transmission createTransmission(int numberOfGears, boolean isAutomatic) {
        return new Transmission(Math.max(numberOfGears, 4), false);
    }

    @Override
    public SteeringGear createSteeringGear(boolean powerSteering) {
        return new SteeringGear(powerSteering);
    }
}