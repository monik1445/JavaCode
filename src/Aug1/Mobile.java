package Aug1;

public class Mobile {

    private String brand;
    private  int capacity;
    private String colour;

   Mobile(){
       System.out.println("This is inside default constructor");
    }

    public Mobile(String brand, int capacity) {
        this();
        this.brand = brand;
        this.capacity = capacity;
    }

    public Mobile(String brand, int capacity, String colour) {

        this.brand = brand;
        this.capacity = capacity;
        this.colour = colour;
    }

    public void printMobile(){
        System.out.println("Mobile: " + brand + "-" + capacity + colour);
    }
}
