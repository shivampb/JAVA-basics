package fileClass;

import java.io.File;
import java.io.IOException;

public class file {
    public static void main(String[] args) {
        File obj = new File("C:\\Users\\shiva\\OneDrive\\Desktop\\shivamm.txt");
        boolean exists = obj.exists();

        try {
            if (exists) {
                System.out.println("File already exists.");
            } else {
                boolean created = obj.createNewFile();
                if (created) {
                    System.out.println("File created successfully.");
                } else {
                    System.out.println("Failed to create the file.");
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
