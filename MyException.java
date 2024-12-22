class MyException extends Exception {

    public MyException() {
        super("Custom exception has happened");
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException("This is an exception");
        } catch (MyException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
        
        try {
            throw new MyException("Error", new NullPointerException("Cause: NullPointerException"));
        } catch (MyException e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
    }
}
