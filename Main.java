import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a position in the Fibonacci sequence: ");
        if (scanner.hasNextInt()) {
            int position = scanner.nextInt();

            // Check for negative position before calling fibonacciEquation
            if (position < 0) {
                invalidUserInputs(1); // Handle invalid (negative) input
            } else {
                int result = fibonacciEquation(position);
                System.out.println("The Fibonacci number in position " + position + " is " + result + ".");
            }
        } else {
            invalidUserInputs(2); // Handle non-integer input
        }

        scanner.close();
    }

    // the fibonacciEquation handles the events of user inputing 0 or 1 or a valid integer in which case it returns the results
    public static int fibonacciEquation(int num) {
        // Base cases
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        }
        // Recursive case
        return fibonacciEquation(num - 1) + fibonacciEquation(num - 2);
    }

    //Responces in the case the user inputs are false
    public static void invalidUserInputs(int userInput) {
        if (userInput == 1) {
            System.out.println("Please enter a non-negative integer.");
        } else if (userInput == 2) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
    }
}
