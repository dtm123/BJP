// Building Java Programs
// Chapter 2 - Excercise 19
//
// use nested for loop to output & a global constant for the dimensions

/*
Pseudocode algorithm for:

+===+===+
|   |   |
|   |   |
|   |   |
+===+===+
|   |   |
|   |   |
|   |   |
+===+===+

create a global constant for the height

create a method for a line
draw "+"
draw "=" the number of times of the height
draw "+"
draw "=" the number of times of the height
draw "+"
do a line break

create a method for a pane
draw "|"
draw " " the number of times of the height
draw "|"
draw " " the number of times of the height
draw "|"
do a line break

create a main method
call line
call pane the number of times of the height
call line
call pane the number of times of the height
call line


*/


public class Window {
    public static int height = 17;
    public static void line() {
        System.out.print("+");
        for (int i = 1; i < height; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 1; i < height; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
    public static void pane() {
        System.out.print("|");
        for (int i = 1; i < height; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
        for (int i = 1; i < height; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }
    public static void main(String[] args) {
        line();
        for (int i = 1; i < height; i++) {
            pane();
        }
        line();
        for (int i = 1; i < height; i++) {
            pane();
        }
        line();
    }
}
