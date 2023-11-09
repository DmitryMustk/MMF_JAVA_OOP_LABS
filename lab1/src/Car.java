package src;

import java.util.HashMap;
import java.util.Map;

public class Car {
    private Map<Position, Wheel> wheelsMap = new HashMap<>();
    private Body body;
    private Engine engine;
    private Transmission transmission;
    private SteeringGear steeringGear;

    public void setWheel(Position position, Wheel wheel) {
        wheelsMap.put(position, wheel);
    }

    public Wheel getWheel(Position position) {
        return wheelsMap.get(position);
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void setSpoiler(Body body) {
        this.body.addSpoiler();
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setSteeringGear(SteeringGear steeringGear) {
        this.steeringGear = steeringGear;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car Details:\n");
        sb.append("Body colour " + body.getColour() + (body.hasSpoiler() ? ". Body has spoiler" : "") + "\n");
        sb.append("Wheels:\n");
        for (Position position : Position.values()) {
            sb.append(position + " Wheel - Diameter: " + wheelsMap.get(position).getDiameter() + "\", " +
                    "Material: " + wheelsMap.get(position).getMaterial() + "\n");
        }
        sb.append("Engine Volume: " + engine.getVolume() + " L\n");
        sb.append("Transmission: " + transmission.getNumberOfGears() + " gears, " + (transmission.isAutomatic() ? "Automatic" : "Manual") + "\n");
        sb.append("Power Steering: " + (steeringGear.hasPowerSteering() ? "Yes" : "No") + "\n");
        return sb.toString();
    }
}
