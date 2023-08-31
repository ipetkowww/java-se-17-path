package defining_your_own_classes;

//In class Car, define a method named numberOfWheels() that takes no arguments and returns 4.
//Define a constructor that takes an integer argument named seats and uses it to initialize the field numberOfSeats

public class Car {

    int numberOfSeats;

    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int numberOfWheels() {
        return 4;
    }
}
