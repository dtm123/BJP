// Building Java Programs
// Chapter 2 - Excercise 2
//
// use a loop to output
// 1 4 9 16 25 36 49 64 81 100

// 3 5 7 9 11 13 15 ....

public class Two {

    public static void main(String[] args) {
        int b = 1;
        for (int a = 3; a < 22; a = a + 2) {
            System.out.print(b + " ");
            b = b + a;
        
        }
    }
}
