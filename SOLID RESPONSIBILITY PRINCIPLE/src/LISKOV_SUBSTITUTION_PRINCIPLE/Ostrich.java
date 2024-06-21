package LISKOV_SUBSTITUTION_PRINCIPLE;

public class Ostrich extends Bird {
    @Override
    public void move() {
        // logic for running
        System.out.println("The ostrich is running.");
    }
}
