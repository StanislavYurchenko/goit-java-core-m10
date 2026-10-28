import task1.PhoneValidator;
import task2.UserJsonConverter;
import task3.WordFrequency;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Завдання 1 ===");
        PhoneValidator validator = new PhoneValidator();
        validator.printValidPhonesFromFile("resources/task1/file.txt");
        System.out.println();

        System.out.println("=== Завдання 2 ===");
        UserJsonConverter converter = new UserJsonConverter();
        converter.convert("resources/task2/file.txt", "resources/task2/user.json");
        System.out.println();

        System.out.println("=== Завдання 3 ===");
        WordFrequency wordFrequency = new WordFrequency();
        wordFrequency.calculate("resources/task3/words.txt");
    }
}