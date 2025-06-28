import java.io.*;
import java.util.Scanner;

public class FileHandling {

    // Method to create a new text file and write some content
    public static void createAndWriteFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("File created and written successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing the file.");
            e.printStackTrace();
        }
    }

    // Method to read the content of a file
    public static void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Reading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file."); 
            e.printStackTrace();
        }
    }

    // Method to modify an existing file by appending new content
    public static void modifyFile(String fileName, String newContent) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.newLine(); // To ensure the new content is written on a new line
            writer.write(newContent);
            System.out.println("File modified successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while modifying the file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "example.txt";

        System.out.println("File Handling Utility");
        System.out.println("1. Write to file");
        System.out.println("2. Read file");
        System.out.println("3. Modify file");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter content to write: ");
                String content = scanner.nextLine();
                createAndWriteFile(filename, content);
                break;
            case 2:
                readFile(filename);
                break;
            case 3:
                System.out.print("Enter content to append: ");
                String newContent = scanner.nextLine();
                modifyFile(filename, newContent);
                break;
            default:
                System.out.println("Invalid option.");
        }

        scanner.close();
    }
}
