package INTERFACE_SEGREGATION_PRINCIPLE;

public class HumanWorker implements Workable, Eatable {
    @Override
    public void work() {
        // Human working
        System.out.println("Human is working.");
    }

    @Override
    public void eat() {
        // Human eating
        System.out.println("Human is eating.");
    }
}
