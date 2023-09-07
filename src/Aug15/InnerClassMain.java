package Aug15;

public class InnerClassMain {

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerclassobj = outerClass.new InnerClass();
        innerclassobj.InnerMethod();


    }
}
