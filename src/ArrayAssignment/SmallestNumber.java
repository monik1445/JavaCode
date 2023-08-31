package ArrayAssignment;

public class SmallestNumber {
    public static void main(String[] args) {

            int arr[]= {1,2,3,4,5,15};
            int num = 1;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i]==num){
                    System.out.println(num+ " is the smallest number");
                }

            }
        }
    }

