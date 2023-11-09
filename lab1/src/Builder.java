package src;

import java.util.List;

public interface Builder {
    void setBody(Body body);
    void setSpoiler(Body body);
    void setWheels(List<Wheel> wheels);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setSteeringGear(SteeringGear steeringGear);
    Car build();
}
