package Aug12Abstraction;

public abstract class AbstractBirds {


    String Species;
    String colour;

    public AbstractBirds(String species, String colour) {
        Species = species;
        this.colour = colour;
    }

    public abstract void fly();
    public abstract void eat();
    public abstract void layEggs();



}
