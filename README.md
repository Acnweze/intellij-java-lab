# IntelliJ Java Lab

A small Java + Gradle project for practising file editing in IntelliJ IDEA and pushing changes to GitHub.

## Project files

- `settings.gradle` — sets the Gradle project name.
- `build.gradle` — tells Gradle how to build and run the Java application.
- `src/main/java/Main.java` — the Java program you can edit and run.
- `README.md` — project instructions.

## Requirements

- IntelliJ IDEA
- JDK 21

## Run the program

1. Clone this repository in IntelliJ IDEA using **Get from VCS**.
2. Open the project and allow Gradle to finish syncing.
3. Set the Project SDK and Gradle JVM to JDK 21.
4. Open `src/main/java/Main.java`.
5. Click the green run triangle beside `main`, or use the Gradle task `application > run`.

The program displays the date and time, asks for your name, and prints a greeting.

## Editing experiments

Try changing one thing at a time:

1. In `settings.gradle`, change the project name to `my-first-java-project`.
2. In `build.gradle`, change `version = '1.0.0'` to `version = '1.1.0'`. Keep `mainClass = 'Main'` unless you also move or rename the Java class.
3. In `Main.java`, change the welcome message or add another `System.out.println("I made an edit!");` line.
4. In this README, add a sentence under this section.

After each edit, save the file and run the program again if the change affects the Java code. The Gradle files may trigger a Gradle sync.

## Useful Gradle tasks

- `gradle tasks` — lists available tasks.
- `gradle run` — runs the application when Gradle is available.
- `gradle build` — compiles and builds the project.

If you edit files in IntelliJ, use **Git > Commit** and **Push** to send your changes to GitHub.
