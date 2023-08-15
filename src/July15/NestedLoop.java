package July15;

public class NestedLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {    //loop for rows
            for (int j = 0; j <= i; j++) {    // loop for columns
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}

/*
*
**
***
****
*****
 */