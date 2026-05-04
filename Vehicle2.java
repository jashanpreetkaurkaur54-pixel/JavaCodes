
abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

// Car class
class Car extends Vehicle {
    void start() {
        System.out.println("Car started");
    }

    void stop() {
        System.out.println("Car stopped");
    }
}

// Bike class
class Bike extends Vehicle {
    void start() {
        System.out.println("Bike started");
    }

    void stop() {
        System.out.println("Bike stopped");
    }
}

class Bus extends Vehicle {
    void start() {
        System.out.println("Bus started");
    }

    void stop() {
        System.out.println("Bus stopped");
    }
}
public class Vehicle2 {
    public static void main(String[] args) {

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Vehicle v3 = new Bus();

        v1.start();
        v1.stop();

        v2.start();
        v2.stop();

        v3.start();
        v3.stop();
    }
}