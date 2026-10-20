# IntelliJ Java Lab

A small Java + Gradle project for experimenting with IntelliJ IDEA and GitHub.

## Requirements

- IntelliJ IDEA
- JDK 21 (the project uses a Gradle Java toolchain)
- Git, if you want to clone from the terminal

## Open in IntelliJ IDEA

1. In IntelliJ, choose **Get from Version Control**.
2. Paste this repository URL: https://github.com/Acnweze/intellij-java-lab
3. Click **Clone** and open the downloaded project.
4. When prompted, trust/open the project and allow Gradle to sync.
5. Set the Gradle JVM to JDK 21 if IntelliJ asks. If JDK 21 is not installed, install it through IntelliJ's JDK download option.
6. Open `src/main/java/com/acnweze/lab/Main.java` and click the green run icon beside `main`.

## Try these experiments

1. Change the welcome message and run the app again.
2. Add two numbers and print their sum.
3. Ask for a favourite programming language using `Scanner`.
4. Create a new class called `Calculator`.
5. Make a change, commit it, and push it to GitHub from IntelliJ.

## Gradle tasks

- `gradle tasks` — list available tasks
- `gradle run` — run the application (when Gradle is installed/configured)
- `gradle build` — compile and test the project

This starter repository intentionally keeps the code small so you can focus on learning the IDE and build workflow.
