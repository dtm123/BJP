// Building Java Programs
// Chapter 2 - Excercise 4
//
// use nested for loop to output
/*
*
**
***
****
*****
*/

public class Six {
    public static void main(String[] args) {
        for (int i = 1; i < 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
