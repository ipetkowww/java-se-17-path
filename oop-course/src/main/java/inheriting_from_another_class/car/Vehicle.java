package inheriting_from_another_class.car.car;

public class Vehicle {

    private final int numberOfWheels;

    public Vehicle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void makeEngineNoise() {
        System.out.println("Vroom!");
    }
}
