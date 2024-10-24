package day23_10_24;

abstract class EducationalInstitution {
    String name;

    EducationalInstitution(String name) {
        this.name = name;
    }

    abstract void displayDetails();

    void info() {
        System.out.println("Institution Name: " + name);
    }
}

class School extends EducationalInstitution {
    int numberOfStudents;

    School(String name, int numberOfStudents) {
        super(name);
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    void displayDetails() {
        System.out.println("School: " + name);
        System.out.println("Number of Students: " + numberOfStudents);
    }
}

class College extends EducationalInstitution {
    int numberOfCourses;

    College(String name, int numberOfCourses) {
        super(name);
        this.numberOfCourses = numberOfCourses;
    }

    @Override
    void displayDetails() {
        System.out.println("College: " + name);
        System.out.println("Number of Courses: " + numberOfCourses);
    }
}

public class Abstract {
    public static void main(String[] args) {
        EducationalInstitution school = new School("Greenwood High", 500);
        EducationalInstitution college = new College("Tech University", 30);

        school.displayDetails();
        school.info();

        System.out.println(); // For spacing

        college.displayDetails();
        college.info();
    }
}
