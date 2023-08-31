package July18;

import java.util.Scanner;

public class Circle {

    static double PI = 3.14;
    double radius = 2;


    public void CalculateArea(){
        System.out.println("Area of circle is: " + PI * radius * radius);
    }


    public static void main(String[] args) {
        Circle c = new Circle();
        c.CalculateArea();


    }
}
