package InterfaceAssignment.AnimalKingdom;

public class Main {
    public static void main(String[] args) {

        Lion lion = new Lion();
        Penguin penguin = new Penguin();
        Monkey monkey = new Monkey();

        lion.feed();
        lion.makeSound();
        lion.run();

        System.out.println("");
        System.out.println("**********");
        System.out.println("");

        penguin.feed();
        penguin.makeSound();
        penguin.swim();

        System.out.println("");
        System.out.println("**********");
        System.out.println("");

        monkey.feed();
        monkey.makeSound();
        monkey.climb();


    }
}
