class Car {
    private String model; // Private fields
    private int year;
    private double price;

    // Constructor
    public Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Getters and Setters
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Car: " + model + ", Year: " + year + ", Price: $" + price);
    }
}

public class CarInventoryTracker {
    public static void main(String[] args) {
        Car car = new Car("Toyota Camry", 2020, 25000.0);

        car.displayDetails();              // Output: Car: Toyota Camry, Year: 2020, Price: $25000.0
        System.out.println("Model: " + car.getModel()); // Output: Model: Toyota Camry
        car.setPrice(23000.0);             // Update price
        System.out.println("Updated Price: $" + car.getPrice()); // Output: Updated Price: $23000.0
        car.displayDetails();              // Output: Car: Toyota Camry, Year: 2020, Price: $23000.0
    }
}
