package Aug26Interface;
public class TestMain {
    public static void main(String[] args) {

        Mobile mobile = () -> System.out.println("Calling from Lambda");

mobile.text();
    }

}
