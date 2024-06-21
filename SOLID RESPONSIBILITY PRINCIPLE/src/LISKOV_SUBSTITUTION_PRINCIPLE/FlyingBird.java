package LISKOV_SUBSTITUTION_PRINCIPLE;

public class FlyingBird extends Bird {
    @Override
    public void move() {
        fly();
    }

    public void fly() {
        // logic for flying
        System.out.println("The bird is flying.");
    }
}
