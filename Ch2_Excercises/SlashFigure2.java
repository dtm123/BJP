// Building Java Programs
// Chapter 2 - Excercise 17
//
// use nested for loop to output --  Add a global constant for the figure height
/*

!!!!!!!!!!!!!!!!!!!!!!
\\!!!!!!!!!!!!!!!!!!//
\\\\!!!!!!!!!!!!!!////
\\\\\\!!!!!!!!!!//////
\\\\\\\\!!!!!!////////
\\\\\\\\\\!!//////////

 */




 public class SlashFigure {
    public static final int SIZE = 21;
    public static void main(String[] args) {
		for (int line = 1; line <= SIZE; line++) {
			for (int bs = 1; bs <= (line*2-2); bs++) {
				System.out.print("\\");
			}
		for (int bang =1; bang <=((4*SIZE+2)-4*line); bang++) {
			System.out.print("!");
		}
		for (int fs = 1; fs <= (line*2-2); fs++) {
			System.out.print("/");
		}
        System.out.println("");
		}	
    }
}
