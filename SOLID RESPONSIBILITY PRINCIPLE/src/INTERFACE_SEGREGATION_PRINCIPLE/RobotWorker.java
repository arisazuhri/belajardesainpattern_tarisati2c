package INTERFACE_SEGREGATION_PRINCIPLE;

public class RobotWorker implements Workable {
    @Override
    public void work() {
        // Robot working
        System.out.println("Robot is working.");
    }
}
