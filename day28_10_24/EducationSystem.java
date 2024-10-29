package day28_10_24;
class Institution {
    private String name;
    private String location;

    public Institution(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void displayInfo() {
        System.out.println("Institution Name: " + name);
        System.out.println("Location: " + location);
    }
}

class University extends Institution {
    private int numberOfStudents;

    public University(String name, String location, int numberOfStudents) {
        super(name, location);
        this.numberOfStudents = numberOfStudents;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Students: " + numberOfStudents);
    }
}

public class EducationSystem {
    public static void main(String[] args) {
        University university = new University("Greenwood University", "New York", 15000);
        System.out.println("University Information:");
        university.displayInfo();
    }
}
