// Building Java Programs
// Chapter 2 - Excercise 7
//
// use nested for loop to output
/*
    1
   2
  3
 4
5
*/

public class Seven {

    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }

}
