package src;

public class Main {
    public static void main(String[] args) {
        CarFactory avtoVAZFactory = new AvtoVAZFactory();
        Builder avtoVAZBuilder = avtoVAZFactory.createBuilder();
        avtoVAZBuilder.setBody(avtoVAZFactory.createBody("Red"));
        avtoVAZBuilder.setEngine(avtoVAZFactory.createEngine(2.4));
        avtoVAZBuilder.setTransmission(avtoVAZFactory.createTransmission(4, false));
        avtoVAZBuilder.setSteeringGear(avtoVAZFactory.createSteeringGear(true));
        avtoVAZBuilder.setWheels(avtoVAZFactory.createWheels());
        Car avtoVAZCar = avtoVAZBuilder.build();
        System.out.println("AvtoVAZ Car:\n" + avtoVAZCar);

        CarFactory mercedesFactory = new MercedesFactory();
        Builder mercedesBuilder = mercedesFactory.createBuilder();
        mercedesBuilder.setBody(mercedesFactory.createBody("Silver"));
        mercedesBuilder.setEngine(mercedesFactory.createEngine(3.2));
        mercedesBuilder.setTransmission(mercedesFactory.createTransmission(7, true));
        mercedesBuilder.setSteeringGear(mercedesFactory.createSteeringGear(true));
        mercedesBuilder.setWheels(mercedesFactory.createWheels());
        Car mercedesCar = mercedesBuilder.build();
        System.out.println("Mercedes Car:\n" + mercedesCar);
    }
}