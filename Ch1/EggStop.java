// Building Java Programs
// Chapter 1 - Excercise 15
// build - EggStop

/*
  _______
 /       \
/         \
\         /
 \_______/
\         /
 \_______/
 +-------+
  _______
 /       \
/         \
|  STOP   |
\         /
 \_______/
  _______
 /       \
/         \
+---------+


 */


public class EggStop {
    public static void main(String[] args) {
        top();
        bot();
        bot();
        line();
        top();
        stop();
        bot();
        top();
        line2();
    }

    public static void top() {
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }

    public static void line() {
        System.out.println(" +-------+");
    }

    public static void line2() {
        System.out.println("+---------+");
    }

    public static void bot() {
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }

    public static void stop() {
        System.out.println("|  STOP   |");
    }

}
