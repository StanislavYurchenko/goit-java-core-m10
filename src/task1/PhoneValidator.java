package task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class PhoneValidator {

    private static final Pattern PHONE_PATTERN = Pattern.compile("^(\\(\\d{3}\\) |\\d{3}-)\\d{3}-\\d{4}$");

    public void printValidPhonesFromFile(String path) {

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String phone;
            while ((phone = reader.readLine()) != null) {
                if (isValidPhone(phone)) {
                    System.out.println(phone);
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean isValidPhone(String phone) {
        return PHONE_PATTERN.matcher(phone).matches();
    }
}
