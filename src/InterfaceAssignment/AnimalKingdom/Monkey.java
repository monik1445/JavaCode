package InterfaceAssignment.AnimalKingdom;

public class Monkey implements Animal, Climbable{
    @Override
    public void feed() {
        System.out.println("Monkey is eating Banana");
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey hoots");
    }

    @Override
    public void climb() {
        System.out.println("Monkey climbs on trees");
    }
}
