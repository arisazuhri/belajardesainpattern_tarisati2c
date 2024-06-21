package INTERFACE_SEGREGATION_PRINCIPLE;

public class Main {
    public static void main(String[] args) {
        HumanWorker humanWorker = new HumanWorker();
        RobotWorker robotWorker = new RobotWorker();

        humanWorker.work();
        humanWorker.eat();
        robotWorker.work();
    }
}
