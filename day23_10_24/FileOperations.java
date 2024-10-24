package day23_10_24;

import java.io.*;

public class FileOperations {
    public static void writeToFile(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(content + "\n");
            System.out.println("Written to file: " + content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteFile(String filename) {
        File file = new File(filename);
        if (file.delete()) {
            System.out.println("File deleted " + filename);
        } else {
            System.out.println("Failed to delete the file" + filename);
        }
    }

    public static void main(String[] args) {
        String filename = "students.txt";
        writeToFile(filename, "Alice");
        writeToFile(filename, "Bob");
        readFromFile(filename);
        deleteFile(filename);
    }
}
