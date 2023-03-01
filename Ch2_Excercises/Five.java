// Building Java Programs
// Chapter 2 - Excercise 5
//
// use nested for loop to output
/*
*
**
***
****
*****
*/

public class Five {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
