package Aug8;

public class Car2 extends Vehicle2{

    int fuelcapacity = 50;

    public void fuelcap(){
        System.out.println("Vehicle class fuel capacity: " + super.fuelcapacity);

        System.out.println("Car class fuel capacity: " + fuelcapacity);
    }


    }

