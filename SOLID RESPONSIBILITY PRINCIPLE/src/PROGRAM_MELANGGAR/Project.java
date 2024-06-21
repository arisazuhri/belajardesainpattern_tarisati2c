//sambungan melanggar 5

package PROGRAM_MELANGGAR;

public class Project {
    private BackendDeveloper backend = new BackendDeveloper();
    private FrontendDeveloper frontend = new FrontendDeveloper();

    public void develop() {
        backend.writeJava();
        frontend.writeJavaScript();
    }
}
