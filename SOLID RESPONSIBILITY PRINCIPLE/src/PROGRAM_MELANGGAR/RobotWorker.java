//sambungan melanggar4

package PROGRAM_MELANGGAR;

public class RobotWorker implements Worker {
    @Override
    public void work() {
        // Robot working
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robots don't eat");
    }
}
