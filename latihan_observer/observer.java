package latihan_observer;

import java.util.ArrayList;
import java.util.List;

// Observable class
class Observable {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

// Observer interface
interface Observer {
    void update();
}

// Concrete Observer classes
class BinaryObserver implements Observer {
    private Observable observable;

    public BinaryObserver(Observable observable){
        this.observable = observable;
        this.observable.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( observable.getState() ) );
    }
}

class OctalObserver implements Observer {
    private Observable observable;

    public OctalObserver(Observable observable){
        this.observable = observable;
        this.observable.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( observable.getState() ) );
    }
}

class HexaObserver implements Observer {
    private Observable observable;

    public HexaObserver(Observable observable){
        this.observable = observable;
        this.observable.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( observable.getState() ).toUpperCase() );
    }
}


