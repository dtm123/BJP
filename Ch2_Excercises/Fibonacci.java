// Building Java Programs
// Chapter 2 - Excercise 3
//
// use a loop to output the first 12 of the fibonacci sequence
// 1 1 2 3 5 8 13 21 34 55 89 144

public class Fibonacci {
    public static void main(String[] args) {
        int n = 0;
        int o = 1;
        int p;
        System.out.print(o + " ");
        for (int a = 1; a < 12; a++) {
            p = n + o;
            System.out.print(p + " ");
            n = o;
            o = p;
        }
    
    }
}
