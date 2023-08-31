package July29;

public class StringsBufferBuilder {
    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder("Monik");          //      StringBuilder is not thread safe
        s1.append(" Patel");
        System.out.println(s1);

        StringBuffer s2 = new StringBuffer("Krishna");          //      StringBuffer is thread safe
        s2.append(" Shah");
        System.out.println(s2);

    }
}