import java.util.Scanner;

/**
 * A beginner-friendly console calculator for practising Java in IntelliJ IDEA.
 * Supports addition, subtraction, multiplication, and division.
 */
public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==================================");
        System.out.println("       JAVA CONSOLE CALCULATOR");
        System.out.println("==================================");

        boolean running = true;
        while (running) {
            printMenu();
            int choice = readInt("Choose an option (1-5): ");

            switch (choice) {
                case 1 -> calculate('+');
                case 2 -> calculate('-');
                case 3 -> calculate('*');
                case 4 -> calculate('/');
                case 5 -> {
                    running = false;
                    System.out.println("Thanks for using the calculator. Goodbye!");
                }
                default -> System.out.println("Please choose a number from 1 to 5.");
            }
            System.out.println();
        }

        SCANNER.close();
    }

    private static void printMenu() {
        System.out.println("1. Add (+)");
        System.out.println("2. Subtract (-)");
        System.out.println("3. Multiply (*)");
        System.out.println("4. Divide (/)");
        System.out.println("5. Exit");
    }

    private static void calculate(char operator) {
        double first = readDouble("Enter the first number: ");
        double second = readDouble("Enter the second number: ");

        if (operator == '/' && second == 0.0) {
            System.out.println("Error: division by zero is not allowed.");
            return;
        }

        double result = switch (operator) {
            case '+' -> first + second;
            case '-' -> first - second;
            case '*' -> first * second;
            case '/' -> first / second;
            default -> throw new IllegalArgumentException("Unknown operator: " + operator);
        };

        System.out.printf("Result: %s %c %s = %s%n",
                formatNumber(first), operator, formatNumber(second), formatNumber(result));
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = SCANNER.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a whole number.");
            }
        }
    }

    private static double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = SCANNER.nextLine().trim();
            try {
                double value = Double.parseDouble(input);
                if (Double.isFinite(value)) {
                    return value;
                }
                System.out.println("Please enter a finite number.");
            } catch (NumberFormatException exception) {
                System.out.println("That is not a valid number. Try again (for example, 12.5).");
            }
        }
    }

    private static String formatNumber(double value) {
        if (value == Math.rint(value) && Math.abs(value) < 1.0e15) {
            return String.format("%.0f", value);
        }
        return Double.toString(value);
    }
}
