package day23_10_24;

class Course {
    String courseName;

    Course(String courseName) {
        this.courseName = courseName;
    }

    void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
    }
}

class MathCourse extends Course {
    MathCourse(String courseName) {
        super(courseName);
    }

    @Override
    void displayCourseInfo() {
        System.out.println("Math Course: " + courseName);
    }
}

class ScienceCourse extends Course {
    ScienceCourse(String courseName) {
        super(courseName);
    }

    @Override
    void displayCourseInfo() {
        System.out.println("Science Course: " + courseName);
    }
}

public class InheritanceAndPolymorphism {
    public static void main(String[] args) {
        Course math = new MathCourse("Calculus");
        Course science = new ScienceCourse("Physics");

        // Demonstrating polymorphism
        math.displayCourseInfo();
        science.displayCourseInfo();
    }
}
