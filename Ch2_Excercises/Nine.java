// Building Java Programs
// Chapter 2 - Excercise 9
//
// use nested for loop to output
/*
----------------------------------------
_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-
1122334455667788990011223344556677889900
----------------------------------------
*/

public class Nine {
    public static void main(String[] args) {
        line();
        System.out.println();
        oth();
        System.out.println();
        num();
        System.out.println();
        line();
    }
            
    public static void line() {
        for (int j = 0; j < 40; j++) {
        System.out.print("-");
        }
    }

    public static void num() {
        for (int l = 0; l < 2; l++) {
            for (int m = 1; m < 10; m++) {
                System.out.print(m);
                System.out.print(m);
            }
            System.out.print("00");
        }
    }

    public static void oth() {
        for (int k = 1; k < 11; k++) {
            System.out.print("_-^-");
        }
    }

}

