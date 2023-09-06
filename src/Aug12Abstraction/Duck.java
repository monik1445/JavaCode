package Aug12Abstraction;

public class Duck extends AbstractBirds{
    public Duck(String species, String colour) {
        super(species, colour);
    }

    @Override
    public void fly() {
        System.out.println("Duck flies and floats on water");
    }

    @Override
    public void eat() {
        System.out.println("Duck eats fish");

    }

    @Override
    public void layEggs() {
        System.out.println("Duck lays more eggs");

    }
}
