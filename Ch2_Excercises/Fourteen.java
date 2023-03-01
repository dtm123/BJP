// Building Java Programs
// Chapter 2 - Excercise 14
//
// use nested for loop to output (modify 13)

/*
99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000
 */



 public class Fourteen {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 9; j > -1; j--) {
                for (int k = 0; k < j; k++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
