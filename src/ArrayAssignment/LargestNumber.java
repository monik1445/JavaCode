package ArrayAssignment;

public class LargestNumber {
    public static void main(String[] args) {

        int arr[]= {1,2,3,4,5,15};
        int num = 15;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                System.out.println(num+ " is the largest number");
            }

        }
    }
}
