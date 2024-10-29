package day28_10_24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentRecordSystem {

    private HashMap<Long, List<String>> studentRecords;

    public StudentRecordSystem() {
        studentRecords = new HashMap<>();
    }

    public void addStudent(long id, String name) {
        studentRecords.computeIfAbsent(id, k -> new ArrayList<>()).add(name);
    }

    public List<String> getStudents(long id) {
        return studentRecords.getOrDefault(id, new ArrayList<>());
    }

    public void displayRecords() {
        for (Long id : studentRecords.keySet()) {
            System.out.println("ID: " + id + " | Students: " + studentRecords.get(id));
        }
    }

    public static void main(String[] args) {
        StudentRecordSystem recordSystem = new StudentRecordSystem();

        recordSystem.addStudent(1L, "Alice");
        recordSystem.addStudent(1L, "Bob");
        recordSystem.addStudent(2L, "Charlie");
        recordSystem.addStudent(2L, "David");

        System.out.println("All Student Records:");
        recordSystem.displayRecords();

        System.out.println("\nStudents with ID 1: " + recordSystem.getStudents(1L));
        System.out.println("Students with ID 2: " + recordSystem.getStudents(2L));
    }
}
