// Building Java Programs
// Chapter 2 - Excercise 15
//
// use nested for loop to output
/*
-----1-----
----333----
---55555---
--7777777--
-999999999-
 */





public class Fifteen {

    public static void printDesign() {
        for (int i = 1; i < 10; i = i + 2) {
            for (int k = 6; k > (i + 1) / 2; k--) { 
                System.out.print("-");
            }
            for (int l = 0; l < i ; l++) {
                System.out.print(i);
            }
            for (int k = 6; k > (i + 1) / 2; k--) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printDesign();
    }

}
