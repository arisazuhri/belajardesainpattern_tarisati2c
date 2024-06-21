package DEPENDENCY_INVERSION_PRINCIPLE;

public class BackendDeveloper implements Developer {
    @Override
    public void develop() {
        writeJava();
    }

    public void writeJava() {
        // Java code
        System.out.println("Writing Java code.");
    }
}
