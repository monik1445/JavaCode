package Aug1;

public class Calculator {

    private int num1;
    private int num2;

    public void add(){
        System.out.println("Addition is: " + (num1+num2));
    }

    public void sub(){
        System.out.println("Subtraction is: " + (num1-num2));
    }

    public void mult(){
        System.out.println("Multiplication is: " + (num1*num2));
    }

    public void div(){
        System.out.println("Division is: " + (num1/num2));
    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}
