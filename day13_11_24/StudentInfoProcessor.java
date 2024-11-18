package day13_11_24;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentInfoProcessor {

    public static void main(String[] args) {

        JSONObject student1 = new JSONObject();
        student1.put("studentId", 101);
        student1.put("name", "John Doe");

        JSONArray courses1 = new JSONArray();
        courses1.put("Mathematics");
        courses1.put("Physics");
        courses1.put("Computer Science");

        student1.put("courses", courses1);

        JSONObject grades1 = new JSONObject();
        grades1.put("Mathematics", "A");
        grades1.put("Physics", "B");
        grades1.put("Computer Science", "A");

        student1.put("grades", grades1);

        JSONObject student2 = new JSONObject();
        student2.put("studentId", 102);
        student2.put("name", "Jane Smith");

        JSONArray courses2 = new JSONArray();
        courses2.put("Biology");
        courses2.put("Chemistry");

        student2.put("courses", courses2);

        JSONObject grades2 = new JSONObject();
        grades2.put("Biology", "B");
        grades2.put("Chemistry", "A");

        student2.put("grades", grades2);

        JSONArray students = new JSONArray();
        students.put(student1);
        students.put(student2);

        System.out.println("List of students (JSON format): ");
        System.out.println(students.toString(4));
    }
}
