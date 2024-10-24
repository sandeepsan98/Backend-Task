package day23_10_24;

class Institution {
    Institution() {
        System.out.println("Educational institution created.");
    }

    @Override
    protected void finalize() {
        System.out.println("Educational institution is being garbage collected.");
    }
}

public class ConstructionDestruction {
    public static void main(String[] args) {
        Institution institution1 = new Institution();
        Institution institution2 = new Institution();

        institution1 = null;
        institution2 = null;
        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main method finished.");
    }
}
