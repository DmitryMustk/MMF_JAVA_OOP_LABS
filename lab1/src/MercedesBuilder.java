package src;

import java.util.List;

class MercedesBuilder implements Builder {
    private Car car = new Car();

    @Override
    public void setBody(Body body) {
        car.setBody(body);
    }

    @Override
    public void setSpoiler(Body body) {
        car.setSpoiler(body);
    }

    @Override
    public void setWheels(List<Wheel> wheels) {
        for (Position position : Position.values()) {
            car.setWheel(position, wheels.get(0));
        }
    }

    @Override
    public void setEngine(Engine engine) {
        car.setEngine(engine);
    }

    @Override
    public void setTransmission(Transmission transmission) {
        car.setTransmission(transmission);
    }

    @Override
    public void setSteeringGear(SteeringGear steeringGear) {
        car.setSteeringGear(steeringGear);
    }

    @Override
    public Car build() {
        return car;
    }
}
