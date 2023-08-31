package Aug1;

public class Main {
    public static void main(String[] args) {

        Date date = new Date(1,12,2023); // this creates an object
        date.printDate();

        Date date1 = new Date(1,12);
        date1.printDate();

        Date date2 = new Date(1);
        date2.printDate();
    }
}
