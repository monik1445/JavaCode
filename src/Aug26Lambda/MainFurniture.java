package Aug26Lambda;

public class MainFurniture {
    public static void main(String[] args) {
        Furniture furniture = (String size, String type) -> {
            System.out.println(size+" "+type);
        };
        furniture.size("Large", "Table");
    }
}
