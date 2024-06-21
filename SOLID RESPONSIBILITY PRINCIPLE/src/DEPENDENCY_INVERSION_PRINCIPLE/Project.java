package DEPENDENCY_INVERSION_PRINCIPLE;

import java.util.List;

public class Project {
    private List<Developer> developers;

    public Project(List<Developer> developers) {
        this.developers = developers;
    }

    public void develop() {
        for (Developer developer : developers) {
            developer.develop();
        }
    }
}
