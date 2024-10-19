package Task;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class Student {
    private int admissionNumber;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private int age;

    public Student(int admissionNumber, String firstName, String lastName, String dateOfBirth, String gender, int age) {
        this.admissionNumber = admissionNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.age = age;
    }

    public String toCSV() {
        return "student," + admissionNumber + "," + firstName + "," + lastName + "," + dateOfBirth + "," + gender + "," + age;
    }
}