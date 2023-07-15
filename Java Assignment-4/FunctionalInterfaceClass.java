// Define a functional interface with a single abstract method
@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
}

// FunctionalInterfaceClass class
public class FunctionalInterfaceClass {
    public static void main(String[] args) {
        // Using a lambda expression to implement the functional interface
        MyFunctionalInterface functionalInterface = () -> {
            System.out.println("Executing myMethod through lambda expression.");
        };

        // Calling the abstract method of the functional interface
        functionalInterface.myMethod();

        // Using a method reference to implement the functional interface
        MyFunctionalInterface anotherFunctionalInterface = FunctionalInterfaceClass::executeMethod;

        // Calling the abstract method of the functional interface
        anotherFunctionalInterface.myMethod();
    }

    // Method to be used with the method reference
    static void executeMethod() {
        System.out.println("Executing myMethod through method reference.");
    }
}
