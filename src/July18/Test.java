package July18;

public class Test {

    static String course = "Java";
    int id;
    String name;

    public Test(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setValue(){
        System.out.println(id + " " + name + " " + course);
    }

    public static void main(String[] args) {

        Test t = new Test(101,"Monik");
        Test t1 = new Test(102,"Krishna");
        Test t2 = new Test(103,"Dhruvi");
        Test t3 = new Test(104,"Rasik");
        Test t4 = new Test(105,"Heena");

//        System.out.println(t);
//        System.out.println(t1);
//        System.out.println(t2);
//        System.out.println(t3);
//        System.out.println(t4);

        t.setValue();
        t1.setValue();
        t2.setValue();
        t3.setValue();
        t4.setValue();

    }
}
