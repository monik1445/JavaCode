package July15;

import java.util.Scanner;

public class MethodsParameter {
    Scanner scanner = new Scanner(System.in);


    public static int add(int num1,int num2) {

        int add = num1 + num2;
        return add;
    }
    public static int add(int num1,int num2, int num11, int num12) {

        int add = num1 + num2 + num11 + num12;
        return add;
    }
    public static int sub(int num3, int num4) {

        int sub = num3 / num4;
        return sub;
    }
    public static int div(int num5, int num6) {

        int div = num5 / num6;
        return div;
    }
    public static int mult(int num7, int num8) {
        int mult = num7 * num8;
        return mult;
    }
    public static int mod(int num9, int num10) {
        int mod = num9 % num10;
        return mod;
    }
}
