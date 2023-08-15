package July15;

public class MethodOverloading {

    public static void enterInfo(int age) {
        System.out.println("My age is "+ age);
    }

    public static void enterInfo(String name) {
        System.out.println("My name is " + name);
    }
    public static void enterInfo(double account){
        System.out.println("My balance is " +account);
    }
}
