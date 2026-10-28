# Java File Processing and Serialization (GoIT Java Core — Module 10)

This project contains three standalone tasks focusing on File I/O operations, Regular Expressions, and JSON serialization using the Google Gson library.

## 📦 Tasks Overview

### Task 1: Phone Number Validation (`task1.PhoneValidator`)
Reads a text file containing phone numbers and prints only the valid ones to the console.
* **Valid formats:** `(xxx) xxx-xxxx` or `xxx-xxx-xxxx`
* **Implementation Details:** Utilizes `BufferedReader` for efficient memory usage and `java.util.regex.Pattern` compiled beforehand to match numbers in $O(1)$ time complexity.

### Task 2: User Object Serialization to JSON (`task2.UserJsonConverter`)
Parses a space-delimited text file containing user data (name and age), converts the data into `User` objects, and serializes them into a formatted `user.json` file.
* **Implementation Details:** Ignores the header row, handles multiple spaces between columns using `String.split("\\s+")`, and uses `GsonBuilder().setPrettyPrinting()` to stream the JSON output directly to a `FileWriter`.

### Task 3: Word Frequency Counter (`task3.WordFrequency`)
Reads a text file and calculates the frequency of each word. The output is printed to the console, sorted in descending order based on the frequency count.
* **Implementation Details:** Uses `HashMap<String, Integer>` to store counts. To handle edge cases, empty lines and leading spaces are trimmed. The map entries are sorted dynamically using Java's `List.sort()` with a custom comparator.

---

## 📂 Project Structure

```text
goit-java-core-m10/
├── pom.xml                          # Maven configuration (Gson dependency)
├── resources/                       # Input & Output files
│   ├── task1/file.txt               # Input for Task 1
│   ├── task2/file.txt               # Input for Task 2
│   ├── task2/user.json              # Generated output for Task 2
│   └── task3/words.txt              # Input for Task 3
├── src/
│   ├── task1/PhoneValidator.java
│   ├── task2/User.java
│   ├── task2/UserJsonConverter.java
│   ├── task3/WordFrequency.java
│   └── Main.java                    # Entry point to run all tasks
├── .gitignore
└── README.md
```

## 🚀 How to Run

* Make sure you have **Java 17** (or higher) installed.

* The project relies on the `Gson` library (v2.8.6). It is configured via **pom.xml**, so ensure Maven downloads the dependencies before running.

* Run `the main.java.Main` class to execute and test all three tasks sequentially. Output will be displayed in the console, and user.json will be generated in `resources/task2/`.
