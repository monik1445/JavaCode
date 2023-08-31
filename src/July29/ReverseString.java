package July29;

public class ReverseString {

    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder("Monik");
        StringBuilder s2 = new StringBuilder(" Patel");
        System.out.println(s1.reverse());
        System.out.println(s1.append(s2));
    }
}
