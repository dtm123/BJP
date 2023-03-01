// Building Java Programs
// Chapter 2 - Excercise 13
//
// use nested for loop to output (modify 12)

/*
99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000
 */



 public class Thirteen {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 9; j > -1; j--) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
