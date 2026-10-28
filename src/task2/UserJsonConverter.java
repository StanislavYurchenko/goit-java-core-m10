package task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserJsonConverter {

    public void convert(String sourcePath, String destinationPath) {
        List<User> users = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(sourcePath))) {
            String line;
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] userData = line.split("\\s+");
                String name = userData[0];
                int age = Integer.parseInt(userData[1]);
                User user = new User(name, age);
                users.add(user);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileWriter writer = new FileWriter(destinationPath)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(users, writer);
            System.out.println("File converted: " + destinationPath);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
