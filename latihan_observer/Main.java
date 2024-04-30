package latihan_observer;

// Main class to demonstrate
public class Main {
    public static void main(String[] args) {
        Observable observable = new Observable();

        new BinaryObserver(observable);
        new OctalObserver(observable);
        new HexaObserver(observable);

        System.out.println("First state change: 15");
        observable.setState(15);
        System.out.println("\nSecond state change: 10");
        observable.setState(10);
    }
}