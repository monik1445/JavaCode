package InterfaceAssignment.AnimalKingdom;

public class Lion implements Animal, Runable{
    @Override
    public void feed() {
        System.out.println("Lion is feeding on deer");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion roars");
    }

    @Override
    public void run() {
        System.out.println("Lion runs");
    }
}
