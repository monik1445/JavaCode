package Aug19ExceptionHandling;

public class TestMain {
    public static void main(String[] args) {


        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        try {
            System.out.println(arr[12]);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        finally {
            System.out.println("Print Finally");
        }
    }
}
