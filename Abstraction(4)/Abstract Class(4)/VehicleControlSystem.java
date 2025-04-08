interface Vehicle {
    void start();    // Abstract method
    void stop();     // Abstract method
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car engine started");
    }
    public void stop() {
        System.out.println("Car stopped");
    }
}

class Bicycle implements Vehicle {
    public void start() {
        System.out.println("Pedaling started");
    }
    public void stop() {
        System.out.println("Bicycle stopped");
    }
}

public class VehicleControlSystem {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        car.start();      // Output: Car engine started
        car.stop();       // Output: Car stopped
        bicycle.start();  // Output: Pedaling started
        bicycle.stop();   // Output: Bicycle stopped
    }
}
