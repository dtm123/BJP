// Building Java Programs
// Chapter 2 - Excercise 11
//
// use nested for loop to output
// make the below example easily scalable via number to count while keeping a pipe symbol always above zero
/*
         |         |         |         |         |         |
123456789012345678901234567890123456789012345678901234567890
*/

public class Eleven {

    public static final int scale = 10;
    public static final int cnt = 8;

    public static void cr() {
        System.out.println();
    }

    public static void pipe() {
        for (int i = 1; i < cnt + 1; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
    }

    public static void count() {
        for (int j = 1; j < cnt + 1; j++) {
            System.out.print(j);
        }
        System.out.print("0");
    }

    public static void main(String[] args) {
        for (int l = 0; l < scale; l++) {
            pipe();
        }
        cr();
        for (int k = 0; k < scale; k++) {
            count();
        }
    }
}
