// Building Java Programs
// Chapter 2 - Excercise 10
//
// use nested for loop to output
/*
         |         |         |         |         |         |
123456789012345678901234567890123456789012345678901234567890
*/

public class Ten {

    public static void cr() {
        System.out.println();
    }

    public static void pipe() {
        for (int i = 0; i < 9; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
    }

    public static void count() {
        for (int j = 1; j < 10; j++) {
            System.out.print(j);
        }
        System.out.print("0");
    }

    public static void main(String[] args) {
        for (int l = 0; l < 6; l++) {
            pipe();
        }
        cr();
        for (int k = 0; k < 6; k++) {
            count();
        }
    }
}
