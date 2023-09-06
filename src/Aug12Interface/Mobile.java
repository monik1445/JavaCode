package Aug12Interface;

public class Mobile implements Computer , Telephone{

    @Override
    public void calculate() {
        System.out.println("Computer calculates");
    }

    @Override
    public void makePrograms() {
        System.out.println("Computer calculates");
    }

    @Override
    public void makeCalls() {
        System.out.println("Telephone makes calls");
    }

    @Override
    public void recieveCalls() {
        System.out.println("Telephone rec calls");
    }

    @Override
    public void playGames() {
        System.out.println("Telephone games");
    }
}
