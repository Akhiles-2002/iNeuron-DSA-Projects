// Abstract class with two abstract methods and two concrete methods
abstract class MyClass {
    // Abstract methods
    abstract void abstractMethod1();
    abstract void abstractMethod2();

    // Concrete method 1
    void concreteMethod1() {
        System.out.println("This is concrete method 1.");
    }

    // Concrete method 2
    void concreteMethod2() {
        System.out.println("This is concrete method 2.");
    }
}

// Concrete class extending the abstract class
class MySubClass extends MyClass {
    // Implementing abstract methods
    void abstractMethod1() {
        System.out.println("Implementation of abstract method 1.");
    }

    void abstractMethod2() {
        System.out.println("Implementation of abstract method 2.");
    }
}

// AbstractClass class
public class AbstractClass {
    public static void main(String[] args) {
        MySubClass myObject = new MySubClass();

        myObject.abstractMethod1(); // Calling abstract method 1
        myObject.abstractMethod2(); // Calling abstract method 2

        myObject.concreteMethod1(); // Calling concrete method 1
        myObject.concreteMethod2(); // Calling concrete method 2
    }
}
