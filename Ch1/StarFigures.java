// Building Java Programs
// Chapter 1 - Excercise 13
// build - StarFigures

/*


*****
*****
 * *
  *
 * *

*****
*****
 * *
  *
 * *
*****
*****

  *
  *
  *
*****
*****
 * *
  *
 * *


*/


public class StarFigures {
    public static void main(String[] args) {
        rc();
        br();
        rc();
        row();
        br();
        one();
        rc();
    }
    
    public static void row() {
        System.out.println("*****");
        System.out.println("*****");
    }

    public static void cross() {
        System.out.println(" * * ");
        mid();
        System.out.println(" * * ");
    }

    public static void br() {
        System.out.println();
    }

    public static void mid() {
        System.out.println("  *");        
    }

    public static void rc() {
        row();
        cross();
    }

    public static void one() {
        mid();
        mid();
        mid();
    }

}
