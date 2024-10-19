package Task;

import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class Schoolmanagement {
    public static void main(String[] args) {
        // Define the path to the desktop and the file name
        String desktopPath = System.getProperty("user.home") + "/Desktop/school_data.csv";

        // Create an ArrayList of Students and Teachers
        ArrayList<Object> schoolMembers = new ArrayList<>();

        // Add Student objects
        schoolMembers.add(new Student(101, "John", "Doe", "2001-05-12", "Male", 23));
        schoolMembers.add(new Student(102, "Alice", "Johnson", "2002-07-18", "Female", 22));

        // Add Teacher objects
        schoolMembers.add(new Teacher(201, "Jane", "Smith", "Female", 30));
        schoolMembers.add(new Teacher(202, "Bob", "Martin", "Male", 45));

        // Write the data to the CSV file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(desktopPath))) {
            // Write CSV header
            writer.write("type,id,firstName,lastName,dateOfBirth,gender,age");
            writer.newLine();

            // Loop through the ArrayList and write each member's data
            for (Object member : schoolMembers) {
                if (member instanceof Student) {
                    writer.write(((Student) member).toCSV());
                } else if (member instanceof Teacher) {
                    writer.write(((Teacher) member).toCSV());
                }
                writer.newLine(); // Move to the next line after each entry
            }

            System.out.println("CSV file created successfully on the desktop.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the CSV file.");
            e.printStackTrace();
        }
    }
}