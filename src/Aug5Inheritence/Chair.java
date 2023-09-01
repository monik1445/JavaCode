package Aug5Inheritence;

public class Chair extends Furniture{

    String marble;


    public Chair(String colour, int numOfLegs, String marble) {
        super(colour, numOfLegs);
        this.marble = marble;
    }

    public void display(){
        System.out.println("Colour: " + Colour + "    Legs: " + NumOfLegs + "Marble: " + marble);
    }
}

