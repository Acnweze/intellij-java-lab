# IntelliJ Java Lab: Console Calculator

A complete beginner-friendly Java console calculator for experimenting with IntelliJ IDEA, Gradle, and GitHub.

## Features

- Addition, subtraction, multiplication, and division
- Repeats until you choose Exit
- Checks invalid menu choices and number input
- Prevents division by zero
- Shows whole-number results without unnecessary decimal places

## Project structure

```text
intellij-java-lab/
├── settings.gradle
├── build.gradle
├── README.md
└── src/
    └── main/
        └── java/
            └── Main.java
```

## Requirements

- IntelliJ IDEA
- JDK 21
- Gradle support in IntelliJ IDEA (the IDE can import the Gradle project)

## Open and run in IntelliJ IDEA

1. Clone this repository using **Get from VCS**: `https://github.com/Acnweze/intellij-java-lab.git`.
2. Open the cloned folder and accept the Gradle project import/sync.
3. In **File → Project Structure → Project**, set the Project SDK to JDK 21.
4. In **Settings → Build, Execution, Deployment → Build Tools → Gradle**, set **Gradle JVM** to JDK 21.
5. Open `src/main/java/Main.java`.
6. Click the green run triangle beside `main`, or run the Gradle task **application → run**.

## Try the calculator

Choose an operation by entering its menu number. For example, choose `1`, enter `12` and `8`, and the result should be `12 + 8 = 20`. Choose `5` to exit.

## Editing experiments

1. Change the heading in `Main.java` and run it again.
2. Add a menu option or a new method.
3. Change the project name in `settings.gradle`; Gradle may ask to sync.
4. Change the version in `build.gradle` from `1.0.0` to `1.1.0`, then sync Gradle.
5. Add your own notes to this README.

After practising, use **Git → Commit** and **Push** in IntelliJ IDEA to send your changes to GitHub.

## Gradle tasks

- `gradle run` — run the calculator.
- `gradle build` — compile and build the project.
- `gradle tasks` — list available tasks.

If the Gradle command is not installed globally, run these tasks from IntelliJ's Gradle tool window instead.
