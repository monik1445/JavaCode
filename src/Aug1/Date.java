package Aug1;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(int day, int month) {
        this.day = day;
        this.month = month;
    }

    public Date(int day) {
        this.day = day;
    }

    public void printDate(){
        System.out.println("Date: " + day +" / " + month+ " / " + year);
    }

}
