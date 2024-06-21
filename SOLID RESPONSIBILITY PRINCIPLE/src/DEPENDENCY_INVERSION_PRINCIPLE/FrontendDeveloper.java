package DEPENDENCY_INVERSION_PRINCIPLE;

public class FrontendDeveloper implements Developer {
    @Override
    public void develop() {
        writeJavaScript();
    }

    public void writeJavaScript() {
        // JavaScript code
        System.out.println("Writing JavaScript code.");
    }
}
