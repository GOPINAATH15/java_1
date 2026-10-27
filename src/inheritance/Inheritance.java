package inheritance;

// Base class
class Animal {	
    void sound() {
        System.out.println("Animal is making sound");
    }
}

// Subclass (Inheritance + Method Overriding)
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog is Barking");
    }

    // Inner class inside Dog
    class Puppy {
        void display() {
            System.out.println("This is a Puppy, child of Dog.");
        }
        
    }
}

// Main class
public class Inheritance {
    public static void main(String[] args) {

        // Polymorphism: Parent reference -> Child object
        Animal myAnimal = new Dog();
        myAnimal.sound(); // Output: Dog is Barking

        // Inheritance (Overriding method)
        Dog myDog = new Dog();
        myDog.sound(); // Output: Dog is Barking

        // Inner class usage
        Dog.Puppy myPuppy = myDog.new Puppy();
        myPuppy.display(); // Output: This is a Puppy, child of Dog.
        
    }
}
