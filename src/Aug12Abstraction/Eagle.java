package Aug12Abstraction;

public class Eagle extends AbstractBirds{
    public Eagle(String species, String colour) {
        super(species, colour);
    }

    @Override
    public void fly() {
        System.out.println("Eagle flies in the sky");
    }

    @Override
    public void eat() {
        System.out.println("Eagle hunts mammals");

    }

    @Override
    public void layEggs() {
        System.out.println("Eagle lays 2 eggs");

    }
}
