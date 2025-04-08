abstract class Animal {
    abstract void makeSound(); // Abstract method
    void sleep() {
        System.out.println("Zzz...");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow!");
    }
}

public class AnimalSoundSimulator {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound(); // Output: Woof!
        dog.sleep();     // Output: Zzz...
        cat.makeSound(); // Output: Meow!
        cat.sleep();     // Output: Zzz...
    }
}
