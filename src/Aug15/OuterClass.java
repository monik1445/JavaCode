package Aug15;

public class OuterClass {
    int x = 10;
    public void OuterMethod(){
        System.out.println("Outer method");
    }

    public class InnerClass{

        String name = "Monik";
        public void InnerMethod(){
            System.out.println("Inner Method");
        }
    }
}
