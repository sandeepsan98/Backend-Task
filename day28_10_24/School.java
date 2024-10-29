package day28_10_24;

public class School {
    private String name;

    public School(String name) {
        this.name = name;
    }

    public void displaySchoolName() {
        System.out.println("School Name: " + name);
    }

    public class Student {
        private long id;
        private String studentName;

        public Student(long id, String studentName) {
            this.id = id;
            this.studentName = studentName;
        }

        public void displayInfo() {
            System.out.println("Student ID: " + id);
            System.out.println("Student Name: " + studentName);
            displaySchoolName();
        }
    }

    public static void main(String[] args) {
        School school = new School("Greenwood High");
        School.Student student = school.new Student(1L, "Alice");
        student.displayInfo();
    }
}
