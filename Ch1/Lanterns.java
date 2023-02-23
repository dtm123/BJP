// Building Java Programs
// Chapter 1 - Excercise 14
// build - Lanterns
/*
    *****
  *********
*************

    *****
  *********
*************
+ | | | | | +
*************
    *****
  *********
*************

    *****
  *********
*************
    *****
+ | | | | | +
+ | | | | | +
    *****
    *****
 */


public class Lanterns {
    public static void main(String[] args) {
        top();
        System.out.println();
        top();
        mid();
        nine();
        top();
        System.out.println();
        top();
        five();
        mid();
        mid();
        five();
        five();
    }

    public static void top() {
        five();
        seven();
        nine();
    }

    public static void five() {
        System.out.println("    *****");
    }

    public static void seven() {
        System.out.println("  *********");
    }

    public static void nine() {
        System.out.println("*************");
    }

    public static void mid() {
        System.out.println("+ | | | | | +");
    }
    
}
