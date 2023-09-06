package Aug12Abstraction;

public class AbstractBirdsMain {
    public static void main(String[] args) {

        Eagle eagle = new Eagle("Predator", "Brown");
        Duck duck = new Duck("Swimmer", "White/Black");
        System.out.println(eagle.colour);
        System.out.println(eagle.Species);
        eagle.eat();
        eagle.fly();
        eagle.layEggs();

        System.out.println("***********");

        System.out.println(duck.colour);
        System.out.println(duck.Species);

        duck.eat();
        duck.fly();
        duck.layEggs();

    }
}
