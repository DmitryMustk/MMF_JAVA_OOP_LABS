package src;

import java.util.List;

interface CarFactory {
    Builder createBuilder();
    Body createBody(String color);
    List<Wheel> createWheels();
    Engine createEngine(double volume);
    Transmission createTransmission(int numberOfGears, boolean isAutomatic);
    SteeringGear createSteeringGear(boolean powerSteering);
}

