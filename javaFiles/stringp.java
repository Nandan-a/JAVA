import java.util.InputMismatchException;
import java.util.Scanner;

public class stringp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        try {
            checkGreeting(input);
            checkLength(input);
            System.out.println("Your string passed all checks.");
        } catch (GreetingNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputTooShortException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void checkGreeting(String input) throws GreetingNotFoundException {
        if (!input.startsWith("hello")) {
            throw new GreetingNotFoundException("The string does not start with 'hello'.");
        }
    }

    private static void checkLength(String input) throws InputTooShortException {
        if (input.length() < 20) {
            throw new InputTooShortException("The string contains less than 20 characters.");
        }
    }
}

class GreetingNotFoundException extends Exception {
    public GreetingNotFoundException(String message) {
        super(message);
    }
}

class InputTooShortException extends Exception {
    public InputTooShortException(String message) {
        super(message);
    }
}