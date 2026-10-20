package com.acnweze.lab;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String now = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        System.out.println("================================");
        System.out.println(" Welcome to the IntelliJ Java Lab");
        System.out.println("================================");
        System.out.println("Run time: " + now);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("What is your name? ");
            String name = scanner.nextLine().trim();
            if (name.isBlank()) {
                name = "Java learner";
            }

            System.out.println("Hello, " + name + "! Your Java project is running.");
            System.out.println("Next experiment: edit this message and run it again.");
        }
    }
}
