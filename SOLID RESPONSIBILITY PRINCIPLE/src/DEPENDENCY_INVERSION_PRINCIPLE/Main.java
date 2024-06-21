package DEPENDENCY_INVERSION_PRINCIPLE;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Developer> developers = new ArrayList<>();
        developers.add(new BackendDeveloper());
        developers.add(new FrontendDeveloper());

        Project project = new Project(developers);
        project.develop();
    }
}
