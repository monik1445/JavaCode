package InterfaceAssignment.AnimalKingdom;

public class Penguin implements Animal, Swimmable {
    @Override
    public void feed() {
        System.out.println("Penguin is feeding on fishes");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin squeaks");
    }

    @Override
    public void swim() {
        System.out.println("Penguin swims in water");
    }
}
