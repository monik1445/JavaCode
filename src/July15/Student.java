package July15;

public class Student {
        // properties of class
    String firstname = "Monik";
    int age = 35;
    double marks = 100;
    int id = 55209;

        // method of class
    public void writing(){
        System.out.println("Student is writing");
    }

    public void study(){
        System.out.println("Student is studying");
    }

    public void laziness(){
        System.out.println("student is lazy");
    }

    public void sum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("Sum of two numbers is " + sum);
    }
}
