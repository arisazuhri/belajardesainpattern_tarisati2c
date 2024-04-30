public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        System.out.println("== Mallard Duck ==");
        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.fly();
        System.out.println();

        Duck redHeadDuck = new RedHeadDuck();
        System.out.println("== Red Head Duck ==");
        redHeadDuck.display();
        redHeadDuck.quack();
        redHeadDuck.swim();
        redHeadDuck.fly();
        System.out.println();

        Duck rubberDuck = new RubberDuck();
        System.out.println("== Rubber Duck ==");
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.swim();
        rubberDuck.fly(); // Rubber duck tidak bisa terbang
        System.out.println();

        Duck woodenDuck = new WoodenDuck();
        System.out.println("== Wooden Duck ==");
        woodenDuck.display();
        woodenDuck.quack(); // Wooden duck tidak bersuara
        woodenDuck.swim(); // Mengambang
        woodenDuck.fly(); // Wooden duck tidak bisa terbang
        System.out.println();
    }
}
