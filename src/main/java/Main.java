import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("       INTELLIJ JAVA LAB");
        System.out.println("================================");
        System.out.println("Current date and time: " +
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy, HH:mm")));
        System.out.print("What is your name? ");

        String name = scanner.nextLine().trim();
        if (name.isEmpty()) {
            name = "Java learner";
        }

        System.out.println("Hello, " + name + "! Welcome to your first IntelliJ experiment.");
        System.out.println("You can edit this message and run the program again.");

        scanner.close();
    }
}
