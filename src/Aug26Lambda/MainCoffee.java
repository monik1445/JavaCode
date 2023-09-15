package Aug26Lambda;

public class MainCoffee {
    public static void main(String[] args) {
        Coffee coffee = (String size, String type) -> {
            System.out.println(size+" "+ type);
        };
        coffee.size("Large", "Double double");
    }
}
