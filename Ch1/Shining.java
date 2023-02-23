// Building Java Programs
// Chapter 1 - Excercise 16
// build - Shining
//
// outputs:
//
// 1000 lines of "All work and no play makes Jack a dull boy." -- no loops, only methods, minimal redundancy

public class Shining {
    public static void main(String[] args) {
        x6();
    }
    
    public static void boy() {
        System.out.println("All work and no play makes Jack a dull boy.");
    }

    public static void x2() {
        boy();
        boy();
        boy();
        boy();
        boy();
    }

    public static void x3() {
        x2();
        x2();
        x2();
        x2();
        x2();
    }

    public static void x4() {
        x3();
        x3();
        x3();
        x3();
        x3();
    }

    public static void x5() {
        x4();
        x4();
        x4();
        x4();
    }

    public static void x6() {
        x5();
        x5();
    }

}
