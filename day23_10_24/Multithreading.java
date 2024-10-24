package day23_10_24;

class EnrollmentThread extends Thread {
    String studentName;

    EnrollmentThread(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public void run() {
        System.out.println(studentName + " is enrolling in courses...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(studentName + "'s enrollment was interrupted.");
        }
        System.out.println(studentName + " has successfully enrolled.");
    }
}

public class  Multithreading {
    public static void main(String[] args) {
        EnrollmentThread student1 = new EnrollmentThread("Alice");
        EnrollmentThread student2 = new EnrollmentThread("Bob");

        student1.start();
        student2.start();

        try {
            student1.join();
            student2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All students have been enrolled.");
    }
}
