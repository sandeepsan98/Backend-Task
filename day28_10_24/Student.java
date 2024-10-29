package day28_10_24;

public class Student {

    private long id;
    private String name;
    private int age;

    public Student(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {
        Student student = new Student(1L, "Alice", 20);

        System.out.println("Initial Student Information:");
        student.displayInfo();

        student.setName("Alice Johnson");
        student.setAge(21);

        System.out.println("\nUpdated Student Information:");
        student.displayInfo();
    }
}
