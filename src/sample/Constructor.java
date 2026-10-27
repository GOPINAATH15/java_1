package sample;
class Student {
    String name;
    int age;

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        // Objects created with different values
        Student s1 = new Student("Gopi", 22);
        Student s2 = new Student("Bhuvan", 21);

        s1.display();
        s2.display();
    }
}
