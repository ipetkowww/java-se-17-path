package defining_your_own_classes.houseplant;

// Define an empty class called HousePlant
// The houseplant should have a height, stored as an integer.
// Define a getHeight() method that returns the height of the plant. If you create a plant with, say, new HousePlant(10), then getHeight() should return 10.
// Define a void method named water(). Every time you call this method, the plant grows by 1

public class HousePlant {

    int height;

    HousePlant(int height) {
        this.height = height;
    }

    int getHeight() {
        return height;
    }

    void water() {
        height++;
    }
}
