package LISKOV_SUBSTITUTION_PRINCIPLE;

public class Main {
    public static void main(String[] args) {
        Bird flyingBird = new FlyingBird();
        Bird ostrich = new Ostrich();

        flyingBird.move();
        ostrich.move();
    }
}
