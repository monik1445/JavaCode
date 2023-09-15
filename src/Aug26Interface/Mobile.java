package Aug26Interface;
@FunctionalInterface
public interface Mobile {
    void text();

    static void call() {
        System.out.println("Calling");
    }
}
