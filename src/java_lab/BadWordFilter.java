package java_lab;
import java.io.*;
import java.util.*;

public class BadWordFilter {
    private static final Set<String> BAD_WORDS = new HashSet<>(Arrays.asList(
        "badword1", "badword2", "hate", "violence"
    ));

    public static void main(String[] args) {
        String filePath = "C:\\Users\\asus\\Documents\\sample.txt"; // Change path as needed

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean hasBadWords = false;

            while ((line = reader.readLine()) != null) {
                for (String word : BAD_WORDS) {
                    if (line.toLowerCase().contains(word.toLowerCase())) {
                        hasBadWords = true;
                        break;
                    }
                }
                if (hasBadWords) break;
            }

            if (hasBadWords) {
                System.out.println("Access Denied: File contains prohibited words.");
            } else {
                try (BufferedReader displayReader = new BufferedReader(new FileReader(filePath))) {
                    System.out.println("File Contents:");
                    while ((line = displayReader.readLine()) != null) {
                        System.out.println(line);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
