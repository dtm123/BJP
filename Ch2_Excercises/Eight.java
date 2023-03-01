// Building Java Programs
// Chapter 2 - Excercise 8
//
// use nested for loop to output
/*
    1
   22
  333
 4444
55555
*/


public class Eight {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }

}
