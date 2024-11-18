package day13_11_24;

import java.io.*;
import java.sql.*;

public class AssignmentUploadProcessor {

    public static void main(String[] args) {
        String filePath = "assignments/assignment_101.txt";
        int studentId = 101;
        try {
            readFile(filePath);

            getStudentGrade(studentId);

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file for assignment could not be found.");
        } catch (SQLException e) {
            System.out.println("Error: A database error occurred while retrieving student grade.");
        } catch (Exception e) {
            System.out.println("Error: An unexpected error occurred - " + e.getMessage());
        } finally {
            System.out.println("Final cleanup actions: Closing any resources or connections.");
        }
    }


    public static void readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);

        if (!file.exists()) {
            throw new FileNotFoundException("File not found at: " + filePath);
        }

        System.out.println("Successfully read the file: " + filePath);
    }


    public static void getStudentGrade(int studentId) throws SQLException {
        if (studentId == 101) {
            throw new SQLException("Unable to find student with ID: " + studentId);
        }

        System.out.println("Successfully retrieved grade for student ID: " + studentId);
    }
}
