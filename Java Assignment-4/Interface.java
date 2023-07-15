// Define an interface for vehicles
interface Vehicle {
    void start();
    void accelerate(double speed);
    void brake();
}

// Implement the interface for a Car
class Car implements Vehicle {
    public void start() {
        System.out.println("Car has started.");
    }

    public void accelerate(double speed) {
        System.out.println("Car is accelerating at " + speed + " mph.");
    }

    public void brake() {
        System.out.println("Car is braking.");
    }
}

// Implement the interface for a Bike
class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike has started.");
    }

    public void accelerate(double speed) {
        System.out.println("Bike is accelerating at " + speed + " mph.");
    }

    public void brake() {
        System.out.println("Bike is braking.");
    }
}

// Main class
public class Interface {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.accelerate(60);
        car.brake();

        Vehicle bike = new Bike();
        bike.start();
        bike.accelerate(30);
        bike.brake();
    }
}
