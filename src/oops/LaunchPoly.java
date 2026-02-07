// ===== Parent Class =====
class Animal {

    // Method to be overridden
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// ===== Child Class 1 =====
class Dog extends Animal {

    // Overriding method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// ===== Child Class 2 =====
class Cat extends Animal {

    // Overriding method
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// ===== Main Class =====
public class LaunchPoly {

    public static void main(String[] args) {

        // 🔸 Polymorphism: Parent reference → Child object
        Animal a1 = new Dog();   // runtime object = Dog
        Animal a2 = new Cat();   // runtime object = Cat

        // 🔸 Method call decided at runtime
        a1.sound();   // Output: Dog barks
        a2.sound();   // Output: Cat meows
    }
}
