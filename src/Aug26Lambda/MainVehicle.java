package Aug26Lambda;

public class MainVehicle {
    public static void main(String[] args) {

        Vehicle vehicle = (String model) -> {
            System.out.println(model);
        };
     vehicle.run("Maruti");

    }
}
