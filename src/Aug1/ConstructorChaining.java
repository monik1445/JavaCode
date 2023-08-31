package Aug1;

public class ConstructorChaining {
    public static void main(String[] args) {

        Mobile mobile1 = new Mobile("Apple", 512);
        mobile1.printMobile();

        Mobile mobile2 = new Mobile("Apple", 128, "Black");
        mobile2.printMobile();

    }
}
