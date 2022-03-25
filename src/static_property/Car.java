package static_property;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;

    public Car() {
    }

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    @Override
    public String toString() {
        return "Carname:" + name +
                "\nid:" + numberOfCars +
                "\nEngine:" + engine;

    }
}
