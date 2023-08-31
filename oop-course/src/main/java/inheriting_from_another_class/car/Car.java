package inheriting_from_another_class.car.car;

public class Car extends Vehicle {

    public Car(int numberOfWheels) {
        super(numberOfWheels);
        makeEngineNoise();
    }
}
