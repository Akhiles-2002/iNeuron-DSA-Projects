// Custom exception class
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

// Main class
public class CustomException {
    public static void main(String[] args) {
        try {
            // Throw custom exception
            throw new MyCustomException("This is a custom exception.");
        } catch (MyCustomException e) {
            // Catch and handle the custom exception
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}
